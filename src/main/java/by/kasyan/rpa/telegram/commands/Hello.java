package by.kasyan.rpa.telegram.commands;

public class Hello extends CommandProcessor {

    @Override
    public String getResponse() {
        return printInformation();
    }

    public String printInformation() {
        BotCommand[] commands = BotCommand.values();
        StringBuffer description = new StringBuffer();

        for (BotCommand command : commands) {
            description.append(String.format("\n%s - %s", command.getCommand(), command.getDescription()));
        }

        return String.format("Здравствуйте!" +
                "\nЭто мой первый телеграм бот." +
                "\nЗдесь пока только %s команд. " +
                "Попробуйте ввести комманды ниже и посмотрите что произойдет: %s",
                commands.length,
                description);
    }
}
