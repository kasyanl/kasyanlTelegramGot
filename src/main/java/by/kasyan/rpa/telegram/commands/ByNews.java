package by.kasyan.rpa.telegram.commands;

public class ByNews extends CommandProcessor {
    @Override
    public String getResponse() {
        return String.format("%s, %n%s",
                newsFromOnt(),
                newsFromTutBy());
    }

    private String newsFromTutBy() {
        return "Последние новости в беларуси:" +
                "\nhttps://tut.by";
    }

    private String newsFromOnt() {
        return "";
    }
}
