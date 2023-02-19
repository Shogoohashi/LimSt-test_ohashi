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
        double actual = compoundInterestService.getResult(100,0.3,5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("元金4500、金利0.6、年利10の場合、複利計算結果が4777.407873582227になる")
    void getResult1() {
        double expected = 4777.407873582227;
        double actual = compoundInterestService.getResult(4500,0.6,10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("元金15000、金利2、年利3の場合、複利計算結果が15918.12になる")
    void getResult2() {
        double expected = 15918.12;
        double actual = compoundInterestService.getResult(15000,2,3);
        assertThat(actual).isEqualTo(expected);
    }
}