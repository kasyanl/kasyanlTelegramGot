package kasyan.util;

import kasyan.processor.Handler;
import kasyan.processor.State;
import kasyan.processor.User;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import static kasyan.util.RegistrationHandler.NAME_CHANGE;
import static kasyan.util.TelegramUtil.createMessageTemplate;

public class HelpHandler implements Handler {

    @Override
    public List<PartialBotApiMethod<? extends Serializable>> handle(User user, String message) {
        // Создаем кнопку для смены имени
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        List<InlineKeyboardButton> inlineKeyboardButtonsRowOne = List.of(
                TelegramUtil.createInlineKeyboardButton("Сменить имя", NAME_CHANGE));

        inlineKeyboardMarkup.setKeyboard(List.of(inlineKeyboardButtonsRowOne));

        return List.of(TelegramUtil.createMessageTemplate(user).setText(String.format("" +
                "You've asked for help %s? Here it comes!", user.getName()))
                .setReplyMarkup(inlineKeyboardMarkup));

    }

    @Override
    public State operatedBotState() {
        return State.NONE;
    }

    @Override
    public List<String> operatedCallBackQuery() {
        return Collections.emptyList();
    }
}