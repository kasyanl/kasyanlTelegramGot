package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class MoodleShool extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Возврат в меню /menu" +
                "\nЧтобы стать JAVA-програмистом пройди по ссылке" +
                "\nhttps://moodle.jrr.by";
    }
}
