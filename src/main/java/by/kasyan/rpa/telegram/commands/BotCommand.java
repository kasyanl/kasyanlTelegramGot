package by.kasyan.rpa.telegram.commands;

public enum BotCommand {

    START("/start", "Старт"),
    HELLO("/hello", "Приветствие"),
    MENU("/menu", "Вывести меню"),
    NEWS("/news", "Новости"),
    OPEN_MOODLE("/moodle", "Начать обучаться Java"),
    SHOW_POGODA("/pogoda", "Прогноз на неделю"),
    VIDEO("/video","осмотреть видосики"),
    MUSIC("/music", "Послушать музыку"),
    GAMES("/games", "Поиграть в игры"),
    BYE("/bye", "Прощанье"),
    NONE("", "");

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
            case "/news":
                return NEWS;
            case "/menu":
                return MENU;
            case "/video":
                return VIDEO;
            case "/music":
                return MUSIC;
            case "/games":
                return GAMES;
            default:
                return NONE;
        }
    }
}
