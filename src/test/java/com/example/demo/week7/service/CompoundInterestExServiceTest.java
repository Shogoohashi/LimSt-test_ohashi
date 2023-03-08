package com.example.demo.week7.service;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompoundInterestExServiceTest {

    CompoundInterestExService compoundInterestExService = new CompoundInterestExService();

    @Test
    @DisplayName("各年の福利計算結果を変数Listに格納して結果を出す。")
    void getPriceList() {
        List<Double> expected = new ArrayList<>();
        expected.add(100.29999999999998);
        expected.add(100.60089999999997);
        expected.add(100.90270269999996);
        expected.add(101.20541080809996);
        expected.add(101.50902704052424);
        int principal = 100;
        double rate = 0.3;
        int years = 5;
        List<Double> actual = compoundInterestExService.getPriceList(principal, rate, years);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    @DisplayName("目標金額に達成できなかった場合、目標金額には及ばず・・・を取得する")
    void getIsOveredYearMsg() {
        int principal = 2;
        double rate = 2.1;
        int year = 10;
        int targetPrice = 10;
        String actual = compoundInterestExService.getIsOveredYearMsg
                (compoundInterestExService.getPriceList(principal, rate, year), targetPrice);
        assertThat(actual).isEqualTo("目標金額には及ばず・・・");
    }

    @Test
    @DisplayName("目標金額に達成できた場合、1年目に達成！！！を取得する")
    void getIsOveredYearMsg1() {
        int principal = 2;
        double rate = 2.1;
        int year = 2;
        int targetPrice = 2;
        String actual = compoundInterestExService.getIsOveredYearMsg
                (compoundInterestExService.getPriceList(principal, rate, year), targetPrice);
        assertThat(actual).isEqualTo("1年目に達成！！！");
    }

    @Test
    @DisplayName("目標金額に到達しなかった場合、年数は0年になる")
    void getOveredTargetPriceYear() {
        int principal = 2;
        double rate = 2.1;
        int year = 2;
        int targetPrice = 10;
        int actual = compoundInterestExService.getOveredTargetPriceYear
                (compoundInterestExService.getPriceList(principal, rate, year), targetPrice);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    @DisplayName("目標金額に到達した場合、年数は1年になる")
    void getOveredTargetPriceYear1() {
        int principal = 2;
        double rate = 2.1;
        int year = 2;
        int targetPrice = 2;
        int actual = compoundInterestExService.getOveredTargetPriceYear
                (compoundInterestExService.getPriceList(principal, rate, year), targetPrice);
        assertThat(actual).isEqualTo(1);
    }
}