package com.example.demo.week3.service;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SingleNabeatuServiceTest {


    SingleNabeatuService service = new SingleNabeatuService();

    @Test
    void isAhoNumber1() {
        assertThat(service.isAhoNumber(0), is(false));
    }

    @Test
    void isAhoNumber2() {
        assertThat(service.isAhoNumber(15), is(true));
    }

    @Test
    void isAhoNumber3() {
        assertThat(service.isAhoNumber(2), is(false));
    }
}