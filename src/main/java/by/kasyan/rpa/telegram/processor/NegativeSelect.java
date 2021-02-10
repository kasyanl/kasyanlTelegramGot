package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class NegativeSelect implements CommandProcessor {
    public String getResponse(){
        return "Ответ не верен, подумайте еще!";
    }
}
