//package com.example.demo.bot;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.TelegramBotsApi;
//import org.telegram.telegrambots.meta.api.methods.GetFile;
//import org.telegram.telegrambots.meta.api.objects.Message;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.api.objects.File;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//
//public class VideoDownloadBot extends TelegramLongPollingBot {
//    private static final String BOT_TOKEN = "7335540304:AAFwd_cOoz6dMQPJ3gxwSsSvRXQM6VtnCpU";
//    private static final String BOT_USERNAME = "Web20240616Bot";
//
//    public static void main(String[] args) {
//        try {
//            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
//            botsApi.registerBot(new VideoDownloadBot());
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String getBotToken() {
//        return BOT_TOKEN;
//    }
//
//    @Override
//    public String getBotUsername() {
//        return BOT_USERNAME;
//    }
//
//    @Override
//    public void onUpdateReceived(Update update) {
//        if (update.hasMessage()) {
//            Message message = update.getMessage();
//            if (message.hasVideo()) {
//                String fileId = message.getVideo().getFileId();
//                try {
//                    String filePath = getFilePath(fileId);
//                    if (filePath != null) {
//                        downloadFile(filePath);
//                    }
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    private String getFilePath(String fileId) throws TelegramApiException {
//        GetFile getFile = new GetFile();
//        getFile.setFileId(fileId);
//        File file = execute(getFile);
//        return file.getFilePath();
//    }
//
//    public void videoDownloadFile(String filePath) throws IOException {
//        String fileUrl = String.format("https://api.telegram.org/file/bot%s/%s", BOT_TOKEN, filePath);
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpGet httpGet = new HttpGet(fileUrl);
//        HttpResponse response = httpClient.execute(httpGet);
//        HttpEntity entity = response.getEntity();
//
//        if (entity != null) {
//            InputStream inputStream = entity.getContent();
//            try (FileOutputStream outputStream = new FileOutputStream("downloaded_video.mp4")) {
//                byte[] buffer = new byte[4096];
//                int bytesRead;
//                while ((bytesRead = inputStream.read(buffer)) != -1) {
//                    outputStream.write(buffer, 0, bytesRead);
//                }
//                System.out.println("Video downloaded successfully.");
//            } finally {
//                inputStream.close();
//            }
//            EntityUtils.consume(entity);
//        }
//        httpClient.close();
//    }
//
//
//}
