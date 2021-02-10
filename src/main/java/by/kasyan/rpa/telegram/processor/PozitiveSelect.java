package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class PozitiveSelect implements CommandProcessor {

    public String getResponse(){
        return "Правильно!";
    }
}
