package by.kasyan.rpa.telegram.Answer;

import by.kasyan.rpa.telegram.commands.CommandProcessor;
import by.kasyan.rpa.telegram.commands.headmenu.NotSupported;
import by.kasyan.rpa.telegram.dto.MyResponse;
import by.kasyan.rpa.telegram.processor.*;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Answer3 extends MyResponse implements CommandProcessor {

    public String getResponse() {
        return ("Что из нижеперечисленного относится к переменным примитивного типа?"+
                "\n/1 Переменные типа 'int', double"+
                "\n/2 Переменные типа String"+
                "\n/3 jvkjsdbvkjsdab+" +
                "\n/4 h;dhvb;auvh");

    }
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
        switch (text){
            case "/1": return new MyResponse(chatId, new PozitiveSelect());
            case "/2":
            case "/3":
            case "/4": return new MyResponse(chatId, new NegativeSelect());
            default: return new MyResponse(chatId, new NotSupported());
        }
    }
}
