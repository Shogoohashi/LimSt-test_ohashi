package com.example.demo.week5.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CompoundInterestServiceTest {

    CompoundInterestService compoundInterestService = new CompoundInterestService();

    @Test
    @DisplayName("元金100、金利0.3、年利5の場合、複利計算結果が101.50902704052424になる")
    void getResult() {
        double expected = 101.50902704052424;
        int principal = 100;
        double rate = 0.3;
        int years = 5;
        double actual = compoundInterestService.getResult(principal,rate,years);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("元金4500、金利0.6、年利10の場合、複利計算結果が4777.407873582227になる")
    void getResult1() {
        double expected = 4777.407873582227;
        int principal = 4500;
        double rate = 0.6;
        int years = 10;
        double actual = compoundInterestService.getResult(principal,rate,years);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("元金15000、金利2、年利3の場合、複利計算結果が15918.12になる")
    void getResult2() {
        double expected = 15918.12;
        int principal = 15000;
        double rate = 2;
        int years = 3;
        double actual = compoundInterestService.getResult(principal,rate,years);
        assertThat(actual).isEqualTo(expected);
    }
}