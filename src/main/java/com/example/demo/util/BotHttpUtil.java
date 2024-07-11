package com.example.demo.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;

import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;

public class BotHttpUtil {

    public static void download(String url ,String destPath){
        File destFile = FileUtil.file(destPath);

        // 配置代理
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8866));

        // 发送带代理的请求
        HttpRequest request = HttpUtil.createGet(url);
        request.setProxy(proxy);
        request.execute().writeBody(destFile);

        System.out.println("Download complete.");
    }
}
