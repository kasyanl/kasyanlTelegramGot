package by.kasyan.rpa.telegram.commands;

public class ShowPogoda extends CommandProcessor{
    @Override
    public String getResponse() {
        return "Возврат в меню /menu" +
                "\nАктуальный прогноз погоды:" +
                "\n https://yandex.by/pogoda";
    }
}


