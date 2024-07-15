package com.example.demo.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
//import com.example.demo.bot.MyTelegramBot;
import cn.hutool.extra.pinyin.PinyinUtil;
import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.RespView;
import com.example.demo.domain.Video;
import com.example.demo.domain.VideoPath;
import com.example.demo.handler.NonStaticResourceHttpRequestHandler;
import com.example.demo.mapper.VideoMapper;
import com.example.demo.mapper.VideoPathMapper;
import com.example.demo.view.VodDetailView;
import com.example.demo.view.VodListView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
//import org.telegram.telegrambots.meta.api.methods.GetFile;
//import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
//import org.telegram.telegrambots.meta.api.objects.InputFile;
//import org.telegram.telegrambots.meta.api.objects.Message;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.*;


import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

@RestController
//@RequestMapping("/telegram")
public class TelegramController {

    @Value("${telegram.bot.token}")
    private String botToken;


    @Value("${telegram.filePath:D:\\}")
    private String PATH_FILE;

//    @Autowired
//    private MyTelegramBot telegramBot;

    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private VideoPathMapper videoPathMapper;


    @Autowired
    private NonStaticResourceHttpRequestHandler nonStaticResourceHttpRequestHandler;

//    @PostMapping("/upload")
//    public Message uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("chatId") String chatId) {
//        try {
//            File convFile = new File(file.getOriginalFilename());
//            FileOutputStream fos = new FileOutputStream(convFile);
//            fos.write(file.getBytes());
//            fos.close();
//
//            InputFile inputFile = new InputFile(convFile);
//            SendDocument sendDocument = new SendDocument();
//            sendDocument.setChatId(chatId);
//            sendDocument.setDocument(inputFile);
//
//            Message msg = telegramBot.execute(sendDocument);
//            System.out.println(JSONUtil.toJsonStr(msg));
//
//            return msg;
//        } catch (IOException | TelegramApiException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    @GetMapping("/download")
//    public String downloadFile(@RequestParam("fileId") String fileId) {
//        try {
//            GetFile getFileMethod = new GetFile();
//            getFileMethod.setFileId(fileId);
//            org.telegram.telegrambots.meta.api.objects.File file = telegramBot.execute(getFileMethod);
//            // Construct the file download URL
//            if (Objects.isNull(file)) {
//                throw new BotException("从telegram下载文件失败");
//            }
//            String filePath = file.getFilePath();
//            if (StrUtil.isEmpty(filePath)) {
//                throw new BotException("telegram文件地址为空");
//            }
//            String[] fileSplit = filePath.split("/");
//            if (ArrayUtil.isEmpty(fileSplit)) {
//                throw new BotException("telegram文件名称解析错误");
//            }
//            String fileName = fileSplit[1];
//            String fileUrl = "https://api.telegram.org/file/bot" + botToken + "/" + filePath;
//
//            BotHttpUtil.download(fileUrl, fileName);
//            return "File downloaded successfully! Path: " + filePath;
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//            return "File download failed!";
//        }
//    }

    @RequestMapping(value = "/vod_list", method = RequestMethod.GET)
    public RespView movtype(
            @RequestParam(value = "movtype", required = false) String movtype
            , @RequestParam(value = "page", required = false) Integer pageNum
            , @RequestParam(value = "keyword", required = false) String keyword
            , @RequestParam(value = "vod_area", required = false) String vodArea
            , @RequestParam(value = "vod_class", required = false) String vodClass
    ) throws ServletException, IOException {
        Page page = new Page(pageNum, 10);
        QueryWrapper<Video> queryWrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(movtype)) {

            queryWrapper.eq("type_id_1", movtype);
        }
        if (StrUtil.isNotEmpty(vodArea)) {
            queryWrapper.eq("vod_area", vodArea);

        }
        if (StrUtil.isNotEmpty(vodClass)) {
            queryWrapper.eq("vod_class", vodClass);
        }
//        queryWrapper.like("vod_Actor", keyword);
//        queryWrapper.like("vod_blure", keyword);
        if (StrUtil.isNotEmpty(keyword)) {
            queryWrapper.like("vod_content", keyword);
        }
//        queryWrapper.like("vod_director", keyword);
        if (StrUtil.isNotEmpty(keyword)) {
            queryWrapper.like("vod_en", keyword);
        }
        if (StrUtil.isNotEmpty(keyword)) {
            queryWrapper.like("vod_name", keyword);
        }
//        queryWrapper.like("vod_writer", keyword);
        Page<Video> page1 = videoMapper.selectPage(page, queryWrapper);
        List<VodListView> videos = page1.getRecords().stream().map(item -> {
            VodListView v = new VodListView();
            v.setVodId(item.getId());
            v.setVodPic(item.getVodPic());
            v.setVoName(item.getVodName());
            v.setVodRemarks(item.getVodRemarks());
            return v;
        }).collect(Collectors.toUnmodifiableList());
        return RespView.success(videos);
    }

    @RequestMapping(value = "/vod_detail", method = RequestMethod.GET)
    public RespView vod_detail(@RequestParam("vod_id") Integer vodId) throws ServletException, IOException {
        Video video = videoMapper.selectById(vodId);
        VodDetailView view = new VodDetailView();
        BeanUtil.copyProperties(video, view);
        QueryWrapper<VideoPath> wrapper = new QueryWrapper<VideoPath>();
        wrapper.eq("vod_id", vodId);
        wrapper.orderByAsc("REMARK");
        List<VideoPath> videoPaths = videoPathMapper.selectList(wrapper);
        Map<String, String> vodPlayUrl = new LinkedHashMap<>();
        videoPaths.stream().forEach(item -> vodPlayUrl.put(
                item.getRemark()
                , StrUtil.format("http://127.0.0.1:8080/video/ts/{}/do", item.getId())
        ));
        view.setVodPlayUrl(vodPlayUrl);
        return RespView.success(view);
    }

    @RequestMapping(value = {"/video/{videoId}"}, method = RequestMethod.GET)
    public void video(
            @PathVariable(value = "videoId") String videoId,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        List<VideoPath> videoPaths = videoPathMapper.selectByMap(ImmutableMap.of("id", videoId));
        VideoPath videoPath = videoPaths.get(0);
        String parentPath = videoPath.getParentPath();
        String sourcePath = videoPath.getSourcePath();
        String sourceFile = videoPath.getSourceFile();


        File file = getFile(parentPath + File.separatorChar + sourcePath + sourceFile.split("\\.")[0] + "_ts\\" + sourceFile);
        if (file.exists()) {
            request.setAttribute(NonStaticResourceHttpRequestHandler.ATTR_FILE, file.getAbsolutePath());
            nonStaticResourceHttpRequestHandler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }

    }

    @RequestMapping(value = "/video/ts/{videoPathId}/{fileName}", method = RequestMethod.GET)
    public void videoDetail(
            @PathVariable("videoPathId") String videoPathId
            , @PathVariable("fileName") String fileName
            , HttpServletRequest request
            , HttpServletResponse response
    ) throws ServletException, IOException {
        String path = null;
        List<VideoPath> videoPaths = videoPathMapper.selectByMap(ImmutableMap.of("id", videoPathId));
        VideoPath videoPath = videoPaths.get(0);
        String parentPath = videoPath.getParentPath();
        String sourcePath = videoPath.getSourcePath();
        String sourceFile = videoPath.getSourceFile();
        if (!"do".equals(fileName)) {
            sourceFile = fileName;
        }

        File file = getFile(parentPath  + sourcePath + sourceFile);
        if (file.exists()) {
            request.setAttribute(NonStaticResourceHttpRequestHandler.ATTR_FILE, file.getAbsolutePath());
            nonStaticResourceHttpRequestHandler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }

    private File getFile(String path) {
//        return new File("D:\\project\\demo\\src\\main\\resources\\" + paht);
        return new File("D:\\" + path);
    }

    @RequestMapping(value = "/video/pic/{vodId}/{fileId}", method = RequestMethod.GET)
    public void pic(
            @PathVariable("vodId") String vodId
            , @PathVariable("fileId") String fileId
            , HttpServletRequest request
            , HttpServletResponse response
    ) throws ServletException, IOException {
        List<VideoPath> videoPaths = videoPathMapper.selectByMap(ImmutableMap.of("vod_id", vodId));
        VideoPath videoPath = videoPaths.get(0);
        String parentPath = videoPath.getParentPath();

        File file = getFile(parentPath + File.separatorChar + fileId);
        if (file.exists()) {
            request.setAttribute(NonStaticResourceHttpRequestHandler.ATTR_FILE, file.getAbsolutePath());
            nonStaticResourceHttpRequestHandler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }

    /**
     * 展示评论
     * @param vodId
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping(value = "/show/comment/{vodId}", method = RequestMethod.GET)
    public RespView showComment(
            @PathVariable("vodId") String vodId
    ) throws ServletException, IOException {
        return RespView.success(ImmutableList.of());
    }


    @RequestMapping(value = "/video/txt/parseTxt", method = RequestMethod.POST)
    public void pic(
            @RequestBody String data
    ) throws ServletException, IOException {
        String[] split = data.split("\r\n");
        String dateTime = null;
        String desc = null;
        String name = null;
        String actor = null;
        String pic = null;
        for (String txt : split) {
            if (txt.contains("上市时间：")) {
                dateTime = txt.replace("上市时间：", "").trim();
            } else if (txt.contains("剧情：") || txt.contains("剧情/介绍：")) {
                desc = txt.replace("上市时间：", "").trim();
            } else if (txt.contains("厂商：")) {
                actor = txt.replace("厂商：", "").trim();
            } else if (txt.contains("图片：")) {
                pic = txt.replace("图片：", "").trim();
            } else if (!StrUtil.contains(txt, "：")) {
                name = txt.trim();
            }
        }
        QueryWrapper<Video> vqw = new QueryWrapper<>();
        vqw.orderByDesc("id");
        Page<Video> page = new Page<>(1, 1);
        Page<Video> videoPage = videoMapper.selectPage(page, vqw);
        int videoId = (int) (videoPage.getRecords().get(0).getId() + 1);
        Video video = new Video();
        video.setId(videoId);
        video.setTypeId1(4);
        video.setTypeName("日本动漫");
        video.setVodActor(actor);
        video.setVodArea("日本");
        video.setVodAuthor("TG");
        video.setVodBlurb(desc);
        video.setVodClass("动画,日韩动漫,日本动漫");
        video.setVodContent(desc);
        video.setVodDirector(actor);
        video.setVodEn(PinyinUtil.getPinyin(name));
        video.setVodName(name);
        if(StrUtil.isEmpty(pic)){
            pic = name+".jpg";
        }
        video.setVodPic("http://127.0.0.1:8080/video/pic/" + videoId + "/" + pic);
        video.setVodPlayFrom("yhm3u8");
        video.setVodRemarks("更新至4集");
        video.setVodTime(DateUtil.formatDateTime(DateUtil.date()));
        video.setVodTimeAdd((int) (DateUtil.date().getTime() / 1000));
        video.setVodWriter(actor);
        videoMapper.insert(video);


        QueryWrapper<VideoPath> vpqw = new QueryWrapper<>();
        Long maxVideoPathId = videoPathMapper.selectCount(vpqw);
        int videoPathId = (int) (maxVideoPathId + 1);

        File path = new File("D:\\video\\" + name);
        int idx = 1;
        for (File file : path.listFiles()) {
            if (file.getName().endsWith("_ts") && file.isDirectory()) {
                VideoPath videoPath = new VideoPath();
                videoPath.setId(videoPathId);
                videoPath.setPath("/video/" + videoPathId);
                videoPath.setCreateTime(DateUtil.date().toLocalDateTime());
                videoPath.setUpdateTime(DateUtil.date().toLocalDateTime());
                videoPath.setParentPath("video/" + name + "/");
                videoPath.setSourcePath(file.getName()+ "/");
                videoPath.setVodId(videoId);
                videoPath.setRemark("第"+ idx + "集");
                for (File listFile : file.listFiles()) {
                    if (listFile.getName().endsWith(".m3u8")) {
                        videoPath.setSourceFile(listFile.getName());
                    }
                }
                videoPathMapper.insert(videoPath);
                idx++;
            }
        }
    }


}