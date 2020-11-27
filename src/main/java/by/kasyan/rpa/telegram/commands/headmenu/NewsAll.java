package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;


public class NewsAll extends CommandProcessor {
    @Override
    public String getResponse() {

        return "Новости Беларуси:" +
                "\n - TUT.by" +
                "\n - Onliner.by" +
                "\n - Belta.by" +
                "\nНовости мира:" +
                "\n - Reuturs.com" +
                "\n - EuroNews.com" +
                "\nДругие новостные порталы:" +
                "\n - vsesmi.online" +
                "\nВозврат в общее меню /menu";

    }
}
