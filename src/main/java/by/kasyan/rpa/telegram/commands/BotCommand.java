package by.kasyan.rpa.telegram.commands;

public enum BotCommand {

    START, RANDOM, SELECT_THEME, OPEN_MOODLE, NONE,
    ANSWER1, ANSWER2, ANSWER3, ANSWER4, ANSWER5,;

    public static BotCommand toCommand(String command) {
        switch (command) {
            case "/start": return START;
            case "/random_answer": return RANDOM;
            case "/select_theme": return SELECT_THEME;
            case "/moodle": return OPEN_MOODLE;
            case "/answer1": return ANSWER1;
            case "/answer2": return ANSWER2;
            case "/answer3": return ANSWER3;
            case "/answer4": return ANSWER4;
            case "/answer5": return ANSWER5;
            default: return NONE;
        }
    }
}
