package com.example.demo.job;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class FfmpegSplitVideos {
    private static final String FFMPEG_PATH = "D:\\Program Files\\ffmpeg-master-latest-win64-gpl\\bin\\ffmpeg.exe"; // or provide full path to ffmpeg executable

    public static void main(String[] args) {
        File dir = new File("D:\\project\\demo\\src\\main\\resources\\video");
        processDirectory(dir);
    }

    private static void processDirectory(File dir) {
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    File[] files = file.listFiles();
                    if (Arrays.stream(files).anyMatch(item -> item.getName().endsWith("_ts"))) {
                        continue;
                    }
                    processDirectory(file);
                } else if (file.getName().toLowerCase().endsWith(".mp4")) {
                    splitVideo(file);
                }
            }
        }
    }

    private static void splitVideo(File file) {
        String filePath = file.getAbsolutePath();
        String outputDirPath = file.getParent() + File.separator + file.getName().substring(0, file.getName().lastIndexOf('.')) + "_ts";
        System.out.println(StrUtil.format("开始处理文件【{}】",filePath));

        File outputDir = new File(outputDirPath);
        if (!outputDir.exists()) {
            outputDir.mkdir();
            System.out.println(StrUtil.format("建立目录【{}】",outputDirPath));
        }

        String outputPattern = outputDirPath + File.separator + file.getName().substring(0, file.getName().lastIndexOf('.')) + ".m3u8";

        ProcessBuilder pb = new ProcessBuilder(
                FFMPEG_PATH,



                "-i", filePath,
                "-start_number", "0",
                //设置每片的长度，默认值为2，单位为秒。
                "-hls_time", "120",
                //设置m3u8文件播放列表保存的最多条目
                "-hls_list_size", "1000",
                "-f", "hls",

//                "-i", filePath,
//                "-c", "copy",
//                "-map", "0",
//                "-segment_time", "00:10:00",
//                "-f", "hls",




                outputPattern
        );

        System.out.println(StrUtil.format("执行命令【{}】",StrUtil.join(" ",pb.command())));
        pb.redirectErrorStream(true);
        try {
            Process process = pb.start();
            doWaitFor(process);
            System.out.println(StrUtil.format("文件【{}】创建成功",outputPattern));
        } catch (IOException e) {
            System.out.println(ExceptionUtil.getMessage(e));;
        }
    }


    /**
     * 监听ffmpeg运行过程
     * @param p
     * @return
     */
    public static int doWaitFor(Process p) {
        InputStream in = null;
        InputStream err = null;
        int exitValue = -1; // returned to caller when p is finished
        try {
            System.out.println("comeing");
            in = p.getInputStream();
            err = p.getErrorStream();
            boolean finished = false; // Set to true when p is finished

            while (!finished) {
                try {
                    while (in.available() > 0) {
                        Character c = new Character((char) in.read());
                        System.out.print(c);
                    }
                    while (err.available() > 0) {
                        Character c = new Character((char) err.read());
                        System.out.print(c);
                    }

                    exitValue = p.exitValue();
                    finished = true;

                } catch (IllegalThreadStateException e) {
                    Thread.currentThread().sleep(500);
                }
            }
        } catch (Exception e) {
            System.err.println("doWaitFor();: unexpected exception - "
                    + e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if (err != null) {
                try {
                    err.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return exitValue;
    }
}