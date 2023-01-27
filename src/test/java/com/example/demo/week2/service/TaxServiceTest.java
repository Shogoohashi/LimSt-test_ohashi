package com.example.demo.week2.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TaxServiceTest {

    TaxService service = new TaxService();

    @Test
    void getTaxCalcResult() {
        double expected = 352.0;
        double actual = service.getTaxCalcResult(320);
        assertEquals(expected, actual);
    }

    @Test
    void getTaxRate() {
        double expected = 0.1;
        double actual = service.getTaxRate();
        assertEquals(expected, actual);

    }
}