package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class MusicOnline extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Послушать музыку онлайн:" +
                "\n - zaycev.net" +
                "\n - zvuch.com" +
                "\n - z1.fm" +
                "\n - music.yandex.by" +
                "\nВозврат в общее меню /menu";
    }
}
