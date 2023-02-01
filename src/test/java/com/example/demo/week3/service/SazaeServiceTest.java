package com.example.demo.week3.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;
class SazaeServiceTest {


    SazaeService service = new SazaeService();

    @Test
    void 出した手がグーの場合のテスト() {
        assertThat(service.janken("goo","goo"), is("draw"));
        assertThat(service.janken("goo","choki"), is("win"));
        assertThat(service.janken("goo","per"), is("lose"));
    }

    @Test
    void 出した手がパーの場合のテスト() {
        assertThat(service.janken("per","goo"), is("win"));
        assertThat(service.janken("per","choki"), is("lose"));
        assertThat(service.janken("per","per"), is("draw"));
    }

    @Test
    void 出した手がチョキの場合のテスト() {
        assertThat(service.janken("choki","goo"), is("lose"));
        assertThat(service.janken("choki","choki"), is("draw"));
        assertThat(service.janken("choki","per"), is("win"));
    }
}