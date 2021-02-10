package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class RandomSelectAnswer implements CommandProcessor {

    public static String processText() {
        int number = (int) (Math.random() * 5);
        switch (number) {
            case 1:
                return "/answer1";
            case 2:
                return "/answer2";
            case 3:
                return "/answer3";
            case 4:
                return "/answer4";
            case 5:
                return "/answer5";
            default:
                return "";
        }
    }

    @Override
    public String getResponse() {
        return "Вопрос выбран: " + processText() + "";
    }
}

