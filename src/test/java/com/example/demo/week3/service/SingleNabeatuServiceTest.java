package com.example.demo.week3.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SingleNabeatuServiceTest {


    SingleNabeatuService service = new SingleNabeatuService();

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("数値が0の場合,取得できる")
    void isAhoNumber0(boolean expected) {
        boolean actual = service.isAhoNumber(0);
        assertThat(actual).isFalse();
    }


    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が1の場合、取得できない")
    void isAhoNumber1(boolean expected) {
        boolean actual = service.isAhoNumber(1);
        assertThat(actual).isFalse();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が2の場合、取得できない")
    void isAhoNumber2(boolean expected) {
        boolean actual = service.isAhoNumber(2);
        assertThat(actual).isFalse();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が3の場合、取得できる")
    void isAhoNumber3(boolean expected) {
        boolean actual = service.isAhoNumber(3);
        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が4の場合、取得できない")
    void isAhoNumber4(boolean expected) {
        boolean actual = service.isAhoNumber(4);
        assertThat(actual).isFalse();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が5の場合、取得できない")
    void isAhoNumber5(boolean expected) {
        boolean actual = service.isAhoNumber(5);
        assertThat(actual).isFalse();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が6の場合、取得できる")
    void isAhoNumber6(boolean expected) {
        boolean actual = service.isAhoNumber(6);
        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が7の場合、取得できない")
    void isAhoNumber7(boolean expected) {
        boolean actual = service.isAhoNumber(7);
        assertThat(actual).isFalse();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が8の場合、取得できない")
    void isAhoNumber8(boolean expected) {
        boolean actual = service.isAhoNumber(8);
        assertThat(actual).isFalse();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("入力値が9の場合、取得できる")
    void isAhoNumber9(boolean expected) {
        boolean actual = service.isAhoNumber(9);
        assertThat(actual).isTrue();
    }
}