package com.example.demo.week3.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
class OmikujiServiceTest {

    OmikujiService service = new OmikujiService();

    @Test
    void getResult() {
        String actual = service.getResult();
        assertThat("大吉中吉小吉凶", is(containsString(actual)));

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