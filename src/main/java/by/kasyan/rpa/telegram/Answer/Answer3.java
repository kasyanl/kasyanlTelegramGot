package by.kasyan.rpa.telegram.Answer;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class Answer3 extends CommandProcessor {

    @Override
    public String getResponse() {
        return ("Что из нижеперечисленного относится к переменным примитивного типа?"+
                "\n/1 Переменные типа 'int', double"+
                "\n/2 Переменные типа String");
    }
}
