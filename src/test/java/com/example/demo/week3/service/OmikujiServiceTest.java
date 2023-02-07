package com.example.demo.week3.service;


import java.util.Random;
import org.assertj.core.util.DateUtil;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedConstruction;
import org.mockito.Mockito;
import static org.mockito.Mockito.mockConstruction;
import org.mockito.MockitoAnnotations;
import static org.powermock.api.mockito.PowerMockito.doReturn;
import static org.powermock.api.mockito.PowerMockito.mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest(DateUtil.class)
class OmikujiServiceTest {

    private OmikujiService omikujiService;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void おみくじ結果() {
        final String expected = "大吉";
        Random random = new Random();
        Mockito.when(omikujiService).getClass();
            OmikujiService service = new OmikujiService();
            String actual = service.getResult();
            assertEquals(actual, expected);
        }

    }

    @Test
    void 凶の際のコメント() {
        String expected = "凶です、忘れ物など身の回りには要注意・・・";
        String actual = omikujiService.getResultComment("凶");
        assertEquals(actual, expected);
    }

    @Test
    void 小吉の際のコメント() {
        String expected = "小吉です、いつものように穏やかに過ごせるでしょう";
        String actual = omikujiService.getResultComment("小吉");
        assertEquals(actual, expected);
    }

    @Test
    void 中吉の際のコメント() {
        String expected = "中吉です、いつも以上に楽しく過ごせるでしょう";
        String actual = omikujiService.getResultComment("中吉");
        assertEquals(actual, expected);
    }

    @Test
    void 大吉の際のコメント() {
        String expected = "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。";
        String actual = omikujiService.getResultComment("大吉");
        assertEquals(actual, expected);
    }
}