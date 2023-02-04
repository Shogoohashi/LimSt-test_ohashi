package com.example.demo.week3.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SingleNabeatuServiceTest {


    SingleNabeatuService service = new SingleNabeatuService();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    @DisplayName("3の倍数だとtrue")
    void isAhoNumber1(int Number) {
        boolean expected = true;
        if (Number % 3 == 0) {
            expected = false;
        }
        boolean actual = service.isAhoNumber(0);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    @DisplayName("3の倍数でない数値はtrue")
    void isAhoNumber2(int Number) {
        boolean expected = true;
        if (Number % 3 >= 1) {
            expected = false;
        }
        boolean actual = service.isAhoNumber(0);
        assertEquals(actual, expected);
    }
}