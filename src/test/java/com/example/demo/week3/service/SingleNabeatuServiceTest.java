package com.example.demo.week3.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SingleNabeatuServiceTest {


    SingleNabeatuService service = new SingleNabeatuService();

    @Test
    @DisplayName("0だとエラーになる")
    void isAhoNumber1() {
        assertThat(service.isAhoNumber(0), is(false));
    }

    @Test
    @DisplayName("３の倍数だとtrue")
    void isAhoNumber2() {
        assertThat(service.isAhoNumber(15), is(true));
    }

    @Test
    @DisplayName("3の倍数以外だとエラーになる")
    void isAhoNumber3() {
        assertThat(service.isAhoNumber(2), is(false));
    }
}