package com.example.demo.week3.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SingleNabeatuServiceTest {


    SingleNabeatuService service = new SingleNabeatuService();

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 15, 99, 213, 5692})
    @DisplayName("3の倍数だとtrue")
    void isAhoNumber1(int expected) {
        if (expected % 3 == 0) {
            boolean actual = service.isAhoNumber(3);
            assertThat(actual).isTrue();
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 66, 666, 2456})
    @DisplayName("6の倍数だとtrue")
    void isAhoNumber2(int expected) {
        if (expected % 3 == 0) {
            boolean actual = service.isAhoNumber(6);
            assertThat(actual).isTrue();
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 27, 81, 1233})
    @DisplayName("9の倍数だとtrue")
    void isAhoNumber3(int expected) {
        if (expected % 3 == 0) {
            boolean actual = service.isAhoNumber(9);
            assertThat(actual).isTrue();
        }
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 5, 7, 8, 5531, 20591})
    @DisplayName("3の倍数でない数値はfalse")
    void isAhoNumber4(int expected) {
        if (expected % 3 == 0) {
            boolean actual = service.isAhoNumber(3);
            assertThat(actual).isFalse();
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    @DisplayName("数値が0の場合はfalse")
    void isAhoNumber5(int expected) {
        if (expected == 0) {
            boolean actual = service.isAhoNumber(0);
            assertThat(actual).isFalse();

        }
    }
}