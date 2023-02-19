package com.example.demo.week4.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NabeatuServiceTest {

    NabeatuService service = new NabeatuService();

    @Test
    @DisplayName("合計が0の場合,取得できる")
    void isAhoNumber0() {
        boolean actual = service.isAhoNumber(0);
        assertThat(actual).isFalse();
    }


    @Test
    @DisplayName("合計が1の場合、取得できない")
    void isAhoNumber1() {
        boolean actual = service.isAhoNumber(1);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が2の場合、取得できない")
    void isAhoNumber2() {
        boolean actual = service.isAhoNumber(2);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が3の場合、取得できる")
    void isAhoNumber3() {
        boolean actual = service.isAhoNumber(3);
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("合計が4の場合、取得できない")
    void isAhoNumber4() {
        boolean actual = service.isAhoNumber(4);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が5の場合、取得できない")
    void isAhoNumber5() {
        boolean actual = service.isAhoNumber(5);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が6の場合、取得できる")
    void isAhoNumber6() {
        boolean actual = service.isAhoNumber(6);
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("合計が7の場合、取得できない")
    void isAhoNumber7() {
        boolean actual = service.isAhoNumber(7);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が8の場合、取得できない")
    void isAhoNumber8() {
        boolean actual = service.isAhoNumber(8);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が9の場合、取得できる")
    void isAhoNumber9() {
        boolean actual = service.isAhoNumber(9);
        assertThat(actual).isTrue();
    }

}