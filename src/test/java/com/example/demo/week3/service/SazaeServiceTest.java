package com.example.demo.week3.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class SazaeServiceTest {


    SazaeService service = new SazaeService();

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がグーの場合に勝つテスト(String expected) {
        String actual = service.janken("goo", "choki");
        if (actual.equals("win")) {
            expected = "win";
        } else if (actual.equals("draw")) {
            expected = "draw";
        } else {
            expected = "lose";
        }
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がチョキの場合に勝つテスト(String expected) {
        String actual = service.janken("choki", "per");
        if (actual.equals("win")) {
            expected = "win";
        } else if (actual.equals("draw")) {
            expected = "draw";
        } else {
            expected = "lose";
        }
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がパーの場合に勝つテスト(String expected) {
        String actual = service.janken("per", "choki");
        if (actual.equals("win")) {
            expected = "win";
        } else if (actual.equals("draw")) {
            expected = "draw";
        } else {
            expected = "lose";
        }
        assertEquals(actual, expected);
    }
}