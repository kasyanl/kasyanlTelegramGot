package by.kasyan.rpa.telegram.Answer;

import by.kasyan.rpa.telegram.commands.CommandProcessor;
import by.kasyan.rpa.telegram.commands.headmenu.NotSupported;
import by.kasyan.rpa.telegram.dto.MyResponse;
import by.kasyan.rpa.telegram.processor.InputNumber;
import by.kasyan.rpa.telegram.processor.NegativeSelect;
import by.kasyan.rpa.telegram.processor.PozitiveSelect;

public class Answer5 implements CommandProcessor {

    MyResponse myResponse = new MyResponse();
    InputNumber inputNumber = new InputNumber();
    public String getResponse() {

        return ("Что из нижеперечисленного относится к переменным примитивного типа?"+
                "\n1 Переменные типа 'int', double"+
                "\n2 Переменные типа String"+
                "\n3 jvkjsdbvkjsdab+" +
                "\n4 h;dhvb;auvh"+
                "\n" + processText(myResponse.getChatId()) + "");
    }
    public MyResponse processText(Long chatId) {
        switch (inputNumber.readNumber()){
            case 1: return new MyResponse(chatId, new PozitiveSelect());
            case 2:
            case 3:
            case 4: return new MyResponse(chatId, new NegativeSelect());
            default: return new MyResponse(chatId, new NotSupported());
        }
    }
}
