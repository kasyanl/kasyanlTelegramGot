package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class StartBots extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Давайте поприветствуем друг друга и начнем работу" +
                "\n/hello";
    }
}
