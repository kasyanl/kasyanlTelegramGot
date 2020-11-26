package by.kasyan.rpa.telegram.commands;

public class ByNews extends CommandProcessor {

    @Override
        public String getResponse() {
        return String.format("%s, %n%s",
                newsFromTutBy(),
                newsFromBelta());
    }

    private String newsFromTutBy() {
        return "Возврат в меню /menu"+
                "\nПоследние новости в беларуси:" +
                "\nhttps://news.tut.by";
    }

    private String newsFromBelta() {
        return "Последние официальные новости в беларуси:" +
                "\nhttps://belta.by";
    }
}
