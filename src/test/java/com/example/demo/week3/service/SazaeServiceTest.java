package com.example.demo.week3.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SazaeServiceTest {

    SazaeService service = new SazaeService();

    @Test
    void 自分が出した手が勝つテスト() {
        String expected = "win";
        String actual1 = service.janken("goo", "choki");
        String actual2 = service.janken("choki", "per");
        String actual3 = service.janken("per", "goo");
        assertEquals(actual1, expected);
        assertEquals(actual2, expected);
        assertEquals(actual3, expected);
    }

    @Test
    void 自分が出した手が引き分けテスト() {
        String expected = "draw";
        String actual1 = service.janken("goo", "goo");
        String actual2 = service.janken("choki", "choki");
        String actual3 = service.janken("per", "per");
        assertEquals(actual1, expected);
        assertEquals(actual2, expected);
        assertEquals(actual3, expected);
    }

    @Test
    void 自分が出した手が負けるテスト() {
        String expected = "lose";
        String actual1 = service.janken("per", "choki");
        String actual2 = service.janken("goo", "per");
        String actual3 = service.janken("choki", "goo");
        assertEquals(actual1, expected);
        assertEquals(actual2, expected);
        assertEquals(actual3, expected);
    }
}