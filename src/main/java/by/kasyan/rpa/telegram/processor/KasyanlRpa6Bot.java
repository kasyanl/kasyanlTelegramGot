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

        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add("/video");
        keyboardFirstRow.add("/music");

        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardSecondRow.add("/news");
        keyboardSecondRow.add("/pogoda");

        // третья строчка клавиатуры
        KeyboardRow keyboardTryRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardTryRow.add("/games");
        keyboardTryRow.add("/moodle");

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardTryRow);
        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}



