package com.example.demo.week4.service;

import java.util.Random;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockConstruction;
import org.mockito.MockitoAnnotations;

class EndlessOmikujiServiceTest {

    EndlessOmikujiService service = new EndlessOmikujiService();

    @Mock
    public EndlessOmikujiService mockInfo = new EndlessOmikujiService();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getResult() {
        final String expected = "大吉";
        try (MockedConstruction<Random> ignore = mockConstruction(Random.class,
                (mock, ctx) -> doReturn("大吉").when(mock).(anyInt()))) {
            String actual = service.getResult();
            assertEquals(actual, expected);
        }
    }

    @Test
    void getResultComment() {
    }
}