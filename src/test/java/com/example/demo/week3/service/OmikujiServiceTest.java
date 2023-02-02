package com.example.demo.week3.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OmikujiServiceTest {

    OmikujiService service = new OmikujiService();

    @Test
    void 凶の結果() {
        assertEquals("凶",service.getResult());
    }

    @Test
    void 小吉の結果() {
        assertEquals("小吉",service.getResult());
    }

    @Test
    void 中吉の結果() {
        assertEquals("中吉",service.getResult());
    }

    @Test
    void 大吉の結果() {
        assertEquals("大吉",service.getResult());
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