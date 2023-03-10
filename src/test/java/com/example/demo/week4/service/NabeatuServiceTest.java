package com.example.demo.week4.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NabeatuServiceTest {

    NabeatuService service = new NabeatuService();

    @Test
    @DisplayName("入力値が1の場合、合計の１を返す")
    void getTotalNum() {
        int expected = 1;
        int actual = service.getTotalNum(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("入力値が9の場合、合計の45を返す")
    void getTotalNum1() {
        int expected = 45;
        int actual = service.getTotalNum(9);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("入力値が100000の場合、合計の705082704を返す")
    void getTotalNum2() {
        int expected = 705082704;
        int actual = service.getTotalNum(100000);
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    @DisplayName("合計が0の場合,falseを返す")
    void isAhoNumber0() {
        boolean actual = service.isAhoNumber(0);
        assertThat(actual).isFalse();
    }


    @Test
    @DisplayName("合計が1の場合、falseを返す")
    void isAhoNumber1() {
        boolean actual = service.isAhoNumber(1);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が2の場合、falseを返す")
    void isAhoNumber2() {
        boolean actual = service.isAhoNumber(2);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が3の場合、trueを返す")
    void isAhoNumber3() {
        boolean actual = service.isAhoNumber(3);
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("合計が4の場合、falseを返す")
    void isAhoNumber4() {
        boolean actual = service.isAhoNumber(4);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が5の場合、falseを返す")
    void isAhoNumber5() {
        boolean actual = service.isAhoNumber(5);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が6の場合、trueを返す")
    void isAhoNumber6() {
        boolean actual = service.isAhoNumber(6);
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("合計が7の場合、falseを返す")
    void isAhoNumber7() {
        boolean actual = service.isAhoNumber(7);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が8の場合、falseを返す")
    void isAhoNumber8() {
        boolean actual = service.isAhoNumber(8);
        assertThat(actual).isFalse();
    }

    @Test
    @DisplayName("合計が9の場合、trueを返す")
    void isAhoNumber9() {
        boolean actual = service.isAhoNumber(9);
        assertThat(actual).isTrue();
    }

}