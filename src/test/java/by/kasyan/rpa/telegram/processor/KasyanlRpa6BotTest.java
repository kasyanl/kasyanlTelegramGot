package by.kasyan.rpa.telegram.processor;

import by.kasyan.rpa.telegram.processor.KasyanlRpa6Bot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KasyanlRpa6BotTest {

    KasyanlRpa6Bot kasyanlRpa6Bot;

    @BeforeEach
   public void setUp()
    {kasyanlRpa6Bot = new KasyanlRpa6Bot();
    }
    @Test
    void getBotUsername() {
        String actual = kasyanlRpa6Bot.getBotUsername();
        String expected = "kasyan_rpa6_telegram_bot";
        assertEquals(expected, actual);
    }

    @Test
    void getBotToken() {
        String actual = kasyanlRpa6Bot.getBotToken();
        String expected = "1309794458:AAHD1J0liCYQK7AklzwqrkD7PBy9Lbe7xIo";
        assertEquals(expected, actual);
    }


}