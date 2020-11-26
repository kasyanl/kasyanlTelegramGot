package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.commands.*;
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
        BotCommand command = BotCommand.toCommand(text);
        switch (command) {
            case START:
                return new MyResponse(chatId, new StartBots());
            case MENU:
                return new MyResponse(chatId, new MenuBot());
            case HELLO:
                return new MyResponse(chatId, new Hello());
            case BY_NEWS:
                return new MyResponse(chatId, new ByNews());
            case BYE:
                return new MyResponse(chatId, new ByeBye());
            case OPEN_MOODLE:
                return new MyResponse(chatId, new MoodleShool());
            case SHOW_POGODA:
                return new MyResponse(chatId, new ShowPogoda());
            case WORLD_NEWS:
                return new MyResponse(chatId, new WorldNews());
            case NONE:
            default:
                return new MyResponse(chatId, new NotSupported());
        }
    }
}
