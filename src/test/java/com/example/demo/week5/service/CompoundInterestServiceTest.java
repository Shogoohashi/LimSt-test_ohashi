package com.example.demo.week5.service;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CompoundInterestServiceTest {

    CompoundInterestService compoundInterestService = new CompoundInterestService();

    @Test
    void getResult() {
        double expected = 101.50902704052424;
        double actual = compoundInterestService.getResult(100,0.3,5);
        assertThat(actual).isEqualTo(expected);

    }
}