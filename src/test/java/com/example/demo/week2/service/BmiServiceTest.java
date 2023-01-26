package com.example.demo.week2.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BmiServiceTest {

    BmiService service = new BmiService();

    @Test
    void getBmiCalcResult() {
        double expected = 56 / (1.76 * 1.76);
        double actual = service.getBmiCalcResult(1.76,56);
        assertEquals(expected, actual);
    }
}