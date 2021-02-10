package by.kasyan.rpa.telegram.commands;


public enum EnumSelect {

    ONE,
    TWO,
    THREE,
    FOUR,
    NONE;

    public static EnumSelect toCommand(String command) {
        switch (command) {
            case "/1":
                return ONE;
            case "/2":
                return TWO;
            case "/3":
                return THREE;
            case "/4":
                return FOUR;
            default:
                return NONE;
        }
    }
}
