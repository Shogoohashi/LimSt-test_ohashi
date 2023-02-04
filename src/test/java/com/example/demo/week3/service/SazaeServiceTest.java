package com.example.demo.week3.service;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class SazaeServiceTest {


    SazaeService service = new SazaeService();

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がグーの場合に勝つテスト(String expected) {
        String actual1 = service.janken("goo", "choki");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がチョキの場合に勝つテスト(String expected) {
        String actual1 = service.janken("choki", "per");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がパーの場合に勝つテスト(String expected) {
        String actual1 = service.janken("per", "goo");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がグーの場合に負けるテスト(String expected) {
        String actual1 = service.janken("goo", "per");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がチョキの場合に負けるテスト(String expected) {
        String actual1 = service.janken("choki", "goo");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がパーの場合に負けるテスト(String expected) {
        String actual1 = service.janken("per", "choki");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がグーの場合に引き分けるテスト(String expected) {
        String actual1 = service.janken("goo", "goo");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がチョキの場合に引き分けるテスト(String expected) {
        String actual1 = service.janken("choki", "choki");
        assertEquals(actual1, expected);
    }

    @ParameterizedTest
    @CsvSource({"draw", "win", "lose"})
    void 自分が出した手がパーの場合に引き分けるテスト(String expected) {
        String actual1 = service.janken("per", "per");
        assertEquals(actual1, expected);
    }

}