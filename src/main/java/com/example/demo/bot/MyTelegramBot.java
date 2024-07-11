//package com.example.demo.bot;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//import org.telegram.telegrambots.bots.DefaultBotOptions;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//
//public class MyTelegramBot extends TelegramLongPollingBot {
//
//    private final String botUsername;
//    private final String botToken;
//
//    public MyTelegramBot(String botUsername, String botToken, DefaultBotOptions options) {
//        super(options);
//        this.botUsername = botUsername;
//        this.botToken = botToken;
//    }
//
//    @Override
//    public String getBotUsername() {
//        return botUsername;
//    }
//
//    @Override
//    public String getBotToken() {
//        return botToken;
//    }
//
//    @Override
//    public void onUpdateReceived(Update update) {
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            SendMessage message = new SendMessage();
//            message.setChatId(update.getMessage().getChatId().toString());
//            message.setText("Hello! You said: " + update.getMessage().getText());
//            try {
//                execute(message);
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
