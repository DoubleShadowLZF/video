package com.example.demo.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
//import com.example.demo.bot.MyTelegramBot;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.common.RespView;
import com.example.demo.domain.Video;
import com.example.demo.domain.VideoPath;
import com.example.demo.exp.BotException;
import com.example.demo.handler.NonStaticResourceHttpRequestHandler;
import com.example.demo.mapper.VideoMapper;
import com.example.demo.mapper.VideoPathMapper;
import com.example.demo.service.VideoService;
import com.example.demo.util.BotHttpUtil;
import com.example.demo.view.VodDetailView;
import com.example.demo.view.VodListView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
//import org.telegram.telegrambots.meta.api.methods.GetFile;
//import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
//import org.telegram.telegrambots.meta.api.objects.InputFile;
//import org.telegram.telegrambots.meta.api.objects.Message;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.*;


import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.Wrapper;
import java.util.*;

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
            @RequestParam("movtype") Integer movtype
    ) throws ServletException, IOException {
        List<VodListView> videos = videoMapper.getVideoByTypeId(movtype);
        return RespView.success(videos);
    }

    @RequestMapping(value = "/vod_detail", method = RequestMethod.GET)
    public RespView vod_detail(@RequestParam("vod_id")Integer vodId) throws ServletException, IOException {
        Video video = videoMapper.selectById(vodId);
        VodDetailView view = new VodDetailView();
        BeanUtil.copyProperties(video,view);
        QueryWrapper<VideoPath> wrapper= new QueryWrapper<VideoPath>();
        wrapper.eq("vod_id", vodId);
        wrapper.orderByAsc("REMARK");
        List<VideoPath> videoPaths = videoPathMapper.selectList(wrapper);
        Map<String,String> vodPlayUrl = new LinkedHashMap<>();
        videoPaths.stream().forEach(item -> vodPlayUrl.put(item.getRemark(),item.getPath()));
        view.setVodPlayUrl(vodPlayUrl);
        return RespView.success(view);
    }

    @RequestMapping(value = {"/video/{path}"}, method = RequestMethod.GET)
    public void video(
            @PathVariable(value = "path") String srcPath,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String path = "D:\\project\\demo\\src\\main\\resources\\static\\video\\" + srcPath;

        File file = new File(path);
        if (file.exists()) {
            request.setAttribute(NonStaticResourceHttpRequestHandler.ATTR_FILE, path);
            nonStaticResourceHttpRequestHandler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }

    @RequestMapping(value = "/video/ts/{fileId}", method = RequestMethod.GET)
    public void videoDetail(
            @PathVariable("fileId") String fileId
            , HttpServletRequest request
            , HttpServletResponse response
    ) throws ServletException, IOException {
        String path = "D:\\project\\demo\\src\\main\\resources\\static\\video\\"+fileId;
        File file = new File(path);
        if (file.exists()) {
            request.setAttribute(NonStaticResourceHttpRequestHandler.ATTR_FILE, path);
            nonStaticResourceHttpRequestHandler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }
}