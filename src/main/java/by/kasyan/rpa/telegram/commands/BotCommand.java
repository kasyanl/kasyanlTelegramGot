package by.kasyan.rpa.telegram.commands;

public enum BotCommand {

    NONE("", ""),
    START("/start", "Вывести меню"),
    HELLO("/hello", "Приветствие"),
    BYE("/bye", "Прощанье"),
    OPEN_MOODLE("/moodle", "Начать обучаться Java"),
    SHOW_POGODA("/pogoda", "Прогноз на неделю"),
    BY_NEWS("/bynews", "Новости Беларуси"),
    WORLD_NEWS("/worldnews", "Новости Мира");

    final String command;
    final String description;

    BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }

    public static BotCommand toCommand(String command) {
        switch (command) {
            case "/start":
                return START;
            case "/hello":
                return HELLO;
            case "/bye":
                return BYE;
            case "/moodle":
                return OPEN_MOODLE;
            case "/pogoda":
                return SHOW_POGODA;
            case "/bynews":
                return BY_NEWS;
            case "/worldnews":
                return WORLD_NEWS;
            default:
                return NONE;
        }
    }
}
