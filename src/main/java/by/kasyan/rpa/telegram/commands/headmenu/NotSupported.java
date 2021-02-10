package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class NotSupported implements CommandProcessor {
    @Override
    public String getResponse() {
        return "Команда не поддерживается." +
                "\n Возврат в меню /menu";
    }

}
