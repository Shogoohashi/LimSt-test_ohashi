package com.example.demo.week3.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SingleNabeatuServiceTest {


    SingleNabeatuService service = new SingleNabeatuService();

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 15, 99, 213, 5693})
    @DisplayName("3の数字が含まれている場合、取得できる")
    void isAhoNumber1(int expected) {
        boolean actual = service.isAhoNumber(3);
        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 15, 99, 213, 5692})
    @DisplayName("3の倍数の場合、取得できる")
    void isAhoNumber2(int expected) {
        boolean actual = service.isAhoNumber(6);
        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 15, 99, 213, 5692})
    @DisplayName("３の倍数または３の数字が含まれていない場合、取得できる")
    void isAhoNumber4(int expected) {
        boolean actual = service.isAhoNumber(2);
        assertThat(actual).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    @DisplayName("数値が0の場合,取得できる")
    void isAhoNumber5(int expected) {
        boolean actual = service.isAhoNumber(0);
        assertThat(actual).isFalse();
    }
}