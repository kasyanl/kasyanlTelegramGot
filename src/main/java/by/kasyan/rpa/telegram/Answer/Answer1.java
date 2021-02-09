package by.kasyan.rpa.telegram.Answer;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class Answer1 extends CommandProcessor {

    public String getResponse() {
        return ("Что из нижеперечисленного относится к переменным примитивного типа?"+
                "\n/1 Переменные типа 'int', double"+
                "\n/2 Переменные типа String");
    }
}