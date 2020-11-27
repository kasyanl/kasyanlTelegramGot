package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class ShowPogoda extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Актуальный прогноз погоды:" +
                "\n - pogoda.yandex.by" +
                "\n - accuweather.com" +
                "\nВозврат в общее меню /menu";

    }
}


