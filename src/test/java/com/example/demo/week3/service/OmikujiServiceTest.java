package com.example.demo.week3.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class OmikujiServiceTest {

    OmikujiService service = new OmikujiService();

    @ParameterizedTest
    @ValueSource(strings = {"凶", "小吉", "中吉", "大吉"})
    void おみくじ結果(String s) {
        String actual = service.getResult();
        String expected = "";
        if (actual.equals("大吉")) {
            expected = s;
        }else if(actual.equals("中吉")) {
            expected = s;
        }else if(actual.equals("小吉")) {
            expected = s;
        }else if(actual.equals("小吉")) {
            expected = s;
        }else {
            expected = s;
        }
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