package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.commands.BotCommand;
import by.kasyan.rpa.telegram.commands.ByNews;
import by.kasyan.rpa.telegram.commands.Hello;
import by.kasyan.rpa.telegram.commands.NotSupported;
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
            case HELLO:
                return new MyResponse(chatId, new Hello());
            case BY_NEWS:
                return new MyResponse(chatId, new ByNews());
            case NONE:
            case BYE:
            case OPEN_MOODLE:
            case SHOW_POGODA:
            case WORLD_NEWS:
            default:
                return new MyResponse(chatId, new NotSupported());
        }
    }
}
