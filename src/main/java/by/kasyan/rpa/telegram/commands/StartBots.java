package by.kasyan.rpa.telegram.commands;

public class StartBots extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Давайте поприветствуем друг друга и начнем работу" +
                "\n/hello";
    }
}
