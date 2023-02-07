package com.example.demo.week4.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NabeatuServiceTest {

    NabeatuService service = new NabeatuService();

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 6, 10, 15, 21, 28, 36, 45})
    @DisplayName("１から入力値までの数値の合計数が合っていればtrue")
    void getTotalNum(int Number) {
        int expected = Number;
        int actual = service.getTotalNum(1);
        for (int i = 0; i <= Number; i++) {
            actual = i;
        }
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    @DisplayName("3の倍数だとtrue")
    void isAhoNumber1(int Number) {
        boolean expected = true;
        if (Number % 3 == 0) {
            expected = true;
        }
        boolean actual = service.isAhoNumber(3);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 5, 7, 8})
    @DisplayName("3の倍数でない数値はfalse")
    void isAhoNumber2(int Number) {
        boolean expected = true;
        if (Number % 3 != 0) {
            expected = false;
        }
        boolean actual = service.isAhoNumber(1);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    @DisplayName("数値が0の場合はfalse")
    void isAhoNumber3(int Number) {
        boolean expected = true;
        if (Number == 0) {
            expected = false;
        }
        boolean actual = service.isAhoNumber(0);
        assertEquals(actual, expected);
    }
}