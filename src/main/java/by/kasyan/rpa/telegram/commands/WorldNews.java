package by.kasyan.rpa.telegram.commands;

public class WorldNews extends CommandProcessor {
    @Override
    public String getResponse() {
        return String.format("%s, %n%s",
                reutursCom(),
                euroNewsCom());
            }
        private String reutursCom(){
        return "Возврат в меню /menu" +
                "\nПоследние новости мира на Reuturs" +
                "\nhttps://www.reuters.com/";
        }
        private String euroNewsCom(){
        return "Последние новости мира на EuroNews" +
                "\nhttps://ru.euronews.com/";
        }

}
