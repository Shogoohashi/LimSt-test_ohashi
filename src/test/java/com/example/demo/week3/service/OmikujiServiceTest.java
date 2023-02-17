package com.example.demo.week3.service;


import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.MockedConstruction;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockConstruction;

class OmikujiServiceTest {

     OmikujiService omikujiService = new OmikujiService();

    @Test
    void おみくじの結果が大吉を取得する() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            String actual = omikujiService.getResult();
            String expected = "大吉";
            assertEquals(expected, actual);
        }
    }

    @Test
    void おみくじの結果が中吉を取得する() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(1).when(mock).nextInt(anyInt()))) {
            String actual = omikujiService.getResult();
            String expected = "中吉";
            assertEquals(expected, actual);
        }
    }

    @Test
    void おみくじの結果が小吉を取得する() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(2).when(mock).nextInt(anyInt()))) {
            String actual = omikujiService.getResult();
            String expected = "小吉";
            assertEquals(expected, actual);
        }
    }

    @Test
    void おみくじの結果が凶を取得する() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(4).when(mock).nextInt(anyInt()))) {
            String actual = omikujiService.getResult();
            String expected = "凶";
            assertEquals(expected, actual);
        }
    }

    @Test
    void 凶の際のコメントを取得する() {
        String expected = "凶です、忘れ物など身の回りには要注意・・・";
        String actual = omikujiService.getResultComment("凶");
        assertEquals(expected, actual);
    }

    @Test
    void 小吉の際のコメント取得する() {
        String expected = "小吉です、いつものように穏やかに過ごせるでしょう";
        String actual = omikujiService.getResultComment("小吉");
        assertEquals(expected, actual);
    }

    @Test
    void 中吉の際のコメント取得する() {
        String expected = "中吉です、いつも以上に楽しく過ごせるでしょう";
        String actual = omikujiService.getResultComment("中吉");
        assertEquals(expected, actual);
    }

    @Test
    void 大吉の際のコメント取得する() {
        String expected = "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。" +
                "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。";
        String actual = omikujiService.getResultComment("大吉");
        assertEquals(expected, actual);
    }
}