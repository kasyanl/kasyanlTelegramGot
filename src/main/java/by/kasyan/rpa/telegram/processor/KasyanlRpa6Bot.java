package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.dto.MyResponse;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.List;

@Component
public class KasyanlRpa6Bot extends TelegramLongPollingBot {

    UpdateDispatcher updateDispatcher = new UpdateDispatcher();

    @Override
    public String getBotUsername() {
        return "kasyan_rpa6_telegram_bot";
    }

    @Override
    public String getBotToken() {
        return "1309794458:AAHD1J0liCYQK7AklzwqrkD7PBy9Lbe7xIo";
    }

    @Override
    public void onUpdateReceived(Update update) {
        MyResponse response = updateDispatcher.dispatch(update);
        sendMesg(response);
    }

    public void sendMesg(MyResponse response) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(response.getChatId());
        sendMessage.setText(response.getResponse());

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add("/random_answer");
        keyboardFirstRow.add("/select_theme");

        keyboard.add(keyboardFirstRow);

        replyKeyboardMarkup.setKeyboard(keyboard);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}



