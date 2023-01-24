package com.example.demo.week2.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(expected,actual);
    }
}