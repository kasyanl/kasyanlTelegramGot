package by.kasyan.rpa.telegram.commands.headmenu;

import by.kasyan.rpa.telegram.commands.CommandProcessor;

public class VideoOnline extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Видосики на:" +
                "\n - Youtube.com" +
                "\n - Rutube.ru" +
                "\nПосмотреть фильмы и сериалы бесплатно:" +
                "\n - rezka.ag" +
                "\n - my-hit.org" +
                "\n - seasonvar.ru" +
                "\nВозврат в общее меню /menu";
    }
}
