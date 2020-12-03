package by.kasyan.rpa.telegram.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyResponseTest {

    MyResponse myResponse;

    @BeforeEach
    public void setUp(){
       myResponse = new MyResponse();
    }
    @Test
    void getChatId() {
        Long actual = myResponse.getChatId();
        Long expected = null;
        assertEquals(expected, actual);
       }

    @Test
    void getResponse() {
        String actual = myResponse.getResponse();
        String expected = null;
        assertEquals(expected, actual);
    }
}