package com.example.demo.week2.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BmiServiceTest {

    BmiService service = new BmiService();

    @Test
    void getBmiCalcResult() {
        double expected = 18.078512396694215;
        double actual = service.getBmiCalcResult(1.76,56);
        assertEquals(expected, actual);
    }
}