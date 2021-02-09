package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class MoodleSchool extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Возврат в меню /menu" +
                "\nЧтобы стать просмотеть перечень основной перечень вопросов на собеседовании пройди по ссылке" +
                "\nhttps://moodle.jrr.by/questions";
    }
}
