package com.example.demo.week6.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    @DisplayName("電卓で計算可能な演算子の和名を取得する")
    void getCalcTypeNameArray() {
        String[] expected = {"足し算","引き算","掛け算","割り算"};
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

        Map actual = calculatorService.getCalcTypes();

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
    @DisplayName("addを使用した場合、足し算されて値が20になる")
    void calculate() {
        double expected = 20;
        double firstNum = 10;
        double secondNum = 10;
        double actual = calculatorService.calculate("add", firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("subを使用した場合、引き算されて値が0になる")
    void calculate1() {
        double expected = 0;
        double firstNum = 10;
        double secondNum = 10;
        double actual = calculatorService.calculate("sub", firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("mulを使用した場合、掛け算されて値が100になる")
    void calculate2() {
        double expected = 100;
        double firstNum = 10;
        double secondNum = 10;
        double actual = calculatorService.calculate("mul", firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("divを使用した場合、割り算されて値が1になる")
    void calculate3() {
        double expected = 1;
        double firstNum = 10;
        double secondNum = 10;
        double actual = calculatorService.calculate("div", firstNum, secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("25＋25の場合、50になる")
    void add() {
        double expected = 50;
        double firstNum = 25;
        double secondNum = 25;
        double actual = calculatorService.add(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("25-25の場合、0になる")
    void sub() {
        double expected = 0;
        double firstNum = 25;
        double secondNum = 25;
        double actual = calculatorService.sub(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("25×25の場合、625になる")
    void mul() {
        double expected = 625;
        double firstNum = 25;
        double secondNum = 25;
        double actual = calculatorService.mul(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("25/25の場合、1になる")
    void div() {
        double expected = 1;
        double firstNum = 25;
        double secondNum = 25;
        double actual = calculatorService.div(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }
}