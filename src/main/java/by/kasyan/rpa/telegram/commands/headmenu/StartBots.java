package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class StartBots extends CommandProcessor {
    @Override
    public String getResponse() {

        return "Здраствуйте! Данный бот нацелен на тренировку и оттачивание " +
                "теоретических знаний для прохождения собеседования " +
                "на специальность JAVA-разработчика. Для начала работы выберите тему либо" +
                " воспользуйтесь режимом случайного выбора вопроса:" +
                "\n/random_answer - Выбор случайного вопроса" +
                "\n/select_theme - Выбор темы" +
                "\n/moodle - посмотреть весь перечень вопросов";
    }
}
