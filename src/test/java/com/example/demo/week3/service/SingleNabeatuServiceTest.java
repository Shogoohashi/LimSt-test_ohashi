package com.example.demo.week3.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SingleNabeatuServiceTest {


    SingleNabeatuService service = new SingleNabeatuService();

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("数値が0の場合,取得できる")
    void isAhoNumber0(boolean expected) {
        boolean actual = service.isAhoNumber(0);
        assertThat(actual).isFalse();
    }


    @Test
    @DisplayName("数値が1の場合、trueを返す")
    void isAhoNumber1() {
        boolean actual = service.isAhoNumber(1);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("数値が2の場合、falseを返す")
    void isAhoNumber2() {
        boolean actual = service.isAhoNumber(2);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("数値が3の場合、trueを返す")
    void isAhoNumber3() {
        boolean actual = service.isAhoNumber(3);
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("数値が4の場合、falseを返す")
    void isAhoNumber4() {
        boolean actual = service.isAhoNumber(4);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("数値が5の場合、falseを返す")
    void isAhoNumber5() {
        boolean actual = service.isAhoNumber(5);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("数値が6の場合、trueを返す")
    void isAhoNumber6() {
        boolean actual = service.isAhoNumber(6);
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("数値が7の場合、falseを返す")
    void isAhoNumber7() {
        boolean actual = service.isAhoNumber(7);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("数値が8の場合、falseを返す")
    void isAhoNumber8() {
        boolean actual = service.isAhoNumber(8);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("数値が9の場合、trueを返す")
    void isAhoNumber9() {
        boolean actual = service.isAhoNumber(9);
        assertThat(actual).isTrue();
    }
}