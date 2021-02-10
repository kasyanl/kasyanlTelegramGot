package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.Answer.*;
import by.kasyan.rpa.telegram.commands.BotCommand;
import by.kasyan.rpa.telegram.commands.headmenu.*;
import by.kasyan.rpa.telegram.dto.MyResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UpdateDispatcher {

    public MyResponse dispatch(Update update) {
        if (update.hasMessage()) {
            return processMessage(update.getMessage());
        }
        return new MyResponse();

    }

    private MyResponse processMessage(Message message) {
        if (message.hasText()) {
            return processText(message.getChatId(), message.getText());
        }
        return new MyResponse();
    }

    private MyResponse processText(Long chatId, String text) {
      // BotCommand command = BotCommand.toCommand(text);
        switch (text) {
            case "/start": return new MyResponse(chatId, new Hello());
            case "/random_answer": return new MyResponse(chatId, new RandomSelectAnswer());
            case "/select_theme": return new MyResponse(chatId, new SelectThemeAnswer());
            case "/moodle": return new MyResponse(chatId, new MoodleSchool());
            case "/answer1": return new MyResponse(chatId, new Answer1());
            case "/answer2": return new MyResponse(chatId, new Answer2());
            case "/answer3": return new MyResponse(chatId, new Answer3());
            case "/answer4": return new MyResponse(chatId, new Answer4());
            case "/answer5": return new MyResponse(chatId, new Answer5());

                default:
                return new MyResponse(chatId, new NotSupported());
        }
    }
}
