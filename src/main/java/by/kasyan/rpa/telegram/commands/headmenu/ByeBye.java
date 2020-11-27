package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class ByeBye extends CommandProcessor {

    @Override
    public String getResponse() {
        return "До встречи!" +
               "\nВозврат в меню /menu";
    }
}
