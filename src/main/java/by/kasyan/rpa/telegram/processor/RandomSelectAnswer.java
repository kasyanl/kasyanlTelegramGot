package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.Answer.*;

import by.kasyan.rpa.telegram.commands.CommandProcessor;
import by.kasyan.rpa.telegram.commands.headmenu.NotSupported;
import by.kasyan.rpa.telegram.dto.MyResponse;

public class RandomSelectAnswer extends CommandProcessor {

    public static MyResponse processText(Long chatId){
        int number = (int) (Math.random() * 5);
        switch (number){
            case 1:
                return new MyResponse(chatId, new Answer1());
            case 2:
                return new MyResponse(chatId, new Answer2());
            case 3:
                return new MyResponse(chatId, new Answer3());
            case 4:
                return new MyResponse(chatId, new Answer4());
            case 5:
                return new MyResponse(chatId, new Answer5());
            default:
                return new MyResponse(chatId, new NotSupported());
        }
    }
}
