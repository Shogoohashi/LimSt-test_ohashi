package com.example.demo.week6.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

class CalculatorServiceTest {

    @Spy
    CalculatorService calculatorService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

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
        doReturn(100.0).when(calculatorService).add(anyInt(),anyInt());
        double actual = calculatorService.add(100.0, 100.0);
        assertThat(actual).isEqualTo(200.0);
    }

    @Test
    @DisplayName("subを使用した場合、引き算されて値が1.0になる")
    void calculate1() {
        doReturn(100.0).when(calculatorService).sub(anyInt(),anyInt());
        double actual = calculatorService.sub(11.5,10.5);
        assertThat(actual).isEqualTo(1.0);
    }

    @Test
    @DisplayName("mulを使用した場合、掛け算されて値が236.43になる")
    void calculate2() {
        doReturn(100.0).when(calculatorService).mul(anyInt(),anyInt());
        double actual = calculatorService.mul(11.1,21.3);
        assertThat(actual).isEqualTo(236.43);
    }

    @Test
    @DisplayName("divを使用した場合、割り算されて値が2.0540540540540544になる")
    void calculate3() {
        doReturn(100.0).when(calculatorService).mul(anyInt(),anyInt());
        double actual = calculatorService.div(45.6, 22.2);
        assertThat(actual).isEqualTo(2.0540540540540544);
    }

    @Test
    @DisplayName("25.3＋25.6の場合、50.900000000000006になる")
    void add() {
        double expected = 50.900000000000006;
        double firstNum = 25.3;
        double secondNum = 25.6;
        double actual = calculatorService.add(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("43.4-21.1の場合、22.299999999999997になる")
    void sub() {
        double expected = 22.299999999999997;
        double firstNum = 43.4;
        double secondNum = 21.1;
        double actual = calculatorService.sub(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("11.1×23.4の場合、259.73999999999995になる")
    void mul() {
        double expected = 259.73999999999995;
        double firstNum = 11.1;
        double secondNum = 23.4;
        double actual = calculatorService.mul(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("12.2/6.2の場合、1.9677419354838708になる")
    void div() {
        double expected = 1.9677419354838708;
        double firstNum = 12.2;
        double secondNum = 6.2;
        double actual = calculatorService.div(firstNum,secondNum);
        assertThat(actual).isEqualTo(expected);
    }
}