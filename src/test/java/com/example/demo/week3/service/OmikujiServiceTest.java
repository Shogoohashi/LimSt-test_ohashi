package com.example.demo.week3.service;

import java.util.Random;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

class OmikujiServiceTest {

    OmikujiService service = new OmikujiService();

    @Mock
    private OmikujiService mockInfo = new OmikujiService();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void おみくじ結果() {
        final String expected = "大吉";
        when(mockInfo.getResult()).thenReturn("大吉");
        String actual = service.getResult();
            assertEquals(actual, expected);

    }

    @Test
    void 凶の際のコメント() {
        String expected = "凶です、忘れ物など身の回りには要注意・・・";
        String actual = service.getResultComment("凶");
        assertEquals(actual, expected);
    }

    @Test
    void 小吉の際のコメント() {
        String expected = "小吉です、いつものように穏やかに過ごせるでしょう";
        String actual = service.getResultComment("小吉");
        assertEquals(actual, expected);
    }

    @Test
    void 中吉の際のコメント() {
        String expected = "中吉です、いつも以上に楽しく過ごせるでしょう";
        String actual = service.getResultComment("中吉");
        assertEquals(actual, expected);
    }

    @Test
    void 大吉の際のコメント() {
        String expected = "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。";
        String actual = service.getResultComment("大吉");
        assertEquals(actual, expected);
    }
}