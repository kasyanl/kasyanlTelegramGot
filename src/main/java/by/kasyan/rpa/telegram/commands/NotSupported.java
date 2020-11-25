package by.kasyan.rpa.telegram.commands;

public class NotSupported extends CommandProcessor{
    @Override
    public String getResponse() {
        return "Not supported command";
    }
}
