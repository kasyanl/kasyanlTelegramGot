package by.kasyan.rpa.telegram.commands;

public class ByeBye extends CommandProcessor {

    @Override
    public String getResponse() {
        return "До встречи!" +
               "\nВозврат в меню /menu";
    }
}
