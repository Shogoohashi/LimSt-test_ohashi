package com.example.demo.week6.service;

import java.util.LinkedHashMap;
import java.util.Map;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doReturn;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {

    @Spy
    CalculatorService calculatorService;

    @Test
    @DisplayName("電卓で計算可能な演算子の和名を取得する")
    void getCalcTypeNameArray() {
        String[] expected = {"足し算", "引き算", "掛け算", "割り算"};
        String[] actual = calculatorService.getCalcTypeNameArray();
        assertThat(actual).contains(expected);
    }

    @Test
    @DisplayName("演算子のキーの値を選択した場合,キーの値を取得できる")
    void getCalcTypes() {
        Map<String, String> expected = new LinkedHashMap<>();
        expected.put("add", "+");
        expected.put("sub", "-");
        expected.put("mul", "×");
        expected.put("div", "÷");

        Map<String, String> actual = calculatorService.getCalcTypes();

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    @DisplayName("subの場合、引き算を取得する")
    void convertPysicalCalcType1() {
        String expected = "引き算";
        String actual = calculatorService.convertPysicalCalcType("sub");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("mulの場合、掛け算を取得する")
    void convertPysicalCalcType2() {
        String expected = "掛け算";
        String actual = calculatorService.convertPysicalCalcType("mul");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("divの場合、割り算を取得する")
    void convertPysicalCalcType3() {
        String expected = "割り算";
        String actual = calculatorService.convertPysicalCalcType("div");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("addの場合、足し算を取得する")
    void convertPysicalCalcType4() {
        String expected = "足し算";
        String actual = calculatorService.convertPysicalCalcType("add");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("addを使用した場合、足し算されて値が200.0になる")
    void calculate() {
        doReturn(250.0).when(calculatorService).add(anyDouble(), anyDouble());
        double firstNum = 150.0;
        double secondNum = 100;
        double actual = calculatorService.calculate("add", firstNum, secondNum);
        assertThat(actual).isEqualTo(250.0);
    }

    @Test
    @DisplayName("subを使用した場合、引き算されて値が1.0になる")
    void calculate1() {
        doReturn(10.0).when(calculatorService).sub(anyDouble(), anyDouble());
        double firstNum = 11.5;
        double secondNum = 1.5;
        double actual = calculatorService.calculate("sub", firstNum, secondNum);
        assertThat(actual).isEqualTo(10.0);
    }

    @Test
    @DisplayName("mulを使用した場合、掛け算されて値が236.43になる")
    void calculate2() {
        doReturn(377.46).when(calculatorService).mul(anyDouble(), anyDouble());
        double firstNum = 23.3;
        double secondNum = 16.2;
        double actual = calculatorService.calculate("mul", firstNum, secondNum);
        assertThat(actual).isEqualTo(377.46);
    }

    @Test
    @DisplayName("divを使用した場合、割り算されて値が2.0540540540540544になる")
    void calculate3() {
        doReturn(2.0540540540540544).when(calculatorService).div(anyDouble(), anyDouble());
        double firstNum = 45.6;
        double secondNum = 22.2;
        double actual = calculatorService.calculate("div", firstNum, secondNum);
        assertThat(actual).isEqualTo(2.0540540540540544);
    }

    @Test
    @DisplayName("25.3＋25.6の場合、50.900000000000006になる")
    void add() {
        double expected = 50.900000000000006;
        double firstNum = 25.3;
        double secondNum = 25.6;
        double actual = calculatorService.add(firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("43.4-21.1の場合、22.299999999999997になる")
    void sub() {
        double expected = 22.299999999999997;
        double firstNum = 43.4;
        double secondNum = 21.1;
        double actual = calculatorService.sub(firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("11.1×23.4の場合、259.73999999999995になる")
    void mul() {
        double expected = 259.73999999999995;
        double firstNum = 11.1;
        double secondNum = 23.4;
        double actual = calculatorService.mul(firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("12.2/6.2の場合、1.9677419354838708になる")
    void div() {
        double expected = 1.9677419354838708;
        double firstNum = 12.2;
        double secondNum = 6.2;
        double actual = calculatorService.div(firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }
}