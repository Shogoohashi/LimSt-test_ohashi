package com.example.demo.week2.service;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;



class IntroduceServiceTest {

    IntroduceService service = new IntroduceService();

    @Test
    void getName() {
        String expected = "Soul Hayato";
        String actual = service.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getComment() {
        String expected = "Dream Junkie";
        String actual = service.getComment();
        assertEquals(expected, actual);
    }
}