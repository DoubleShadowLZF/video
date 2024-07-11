//package com.example.demo.config;
//
//import com.example.demo.bot.MyTelegramBot;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.telegram.telegrambots.bots.DefaultBotOptions;
//import org.telegram.telegrambots.meta.TelegramBotsApi;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
//
//@Configuration
//public class TelegramBotConfig {
//
//    @Value("${telegram.bot.token}")
//    private String botToken;
//
//    @Value("${telegram.bot.username}")
//    private String botUsername;
//
//    @Bean
//    public MyTelegramBot myTelegramBot(){
//        // Create DefaultBotOptions instance
//        DefaultBotOptions botOptions = new DefaultBotOptions();
//
//        // Set Socks5 proxy
//        botOptions.setProxyHost("127.0.0.1");
//        botOptions.setProxyPort(7890);
//        botOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);
//        return new MyTelegramBot(botUsername, botToken,botOptions);
//    }
//
//    @Bean
//    public TelegramBotsApi telegramBotsApi(MyTelegramBot myTelegramBot) throws TelegramApiException {
//        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
//        telegramBotsApi.registerBot(myTelegramBot);
//        return telegramBotsApi;
//    }
//}