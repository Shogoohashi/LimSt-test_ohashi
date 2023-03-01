package com.example.demo.week10.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.MockedConstruction;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockConstruction;
import org.mockito.Spy;

class NumeronServiceTest {

    @Spy
    NumeronService numeronService = new NumeronService();

    @Test
    @DisplayName("答えの数列を格納をリスト型の値を返すこと")
    void init() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            List expected = new ArrayList<>(Arrays.asList(0, 1, 2));
            List actual = numeronService.init();
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    @DisplayName("答えの数列と入力値が一致する場合、成功する")
    void getAttackResult() {
        List expected = new ArrayList<>(Arrays.asList(3, 0));
        List test = new ArrayList<>(Arrays.asList(0,1,2));
        List actual = numeronService.getAttackResult(test, "012");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("答えの数列と入力数列が一致した場合、カウントする。")
    void getHitCount() {
        int expected = 3;
        List answer = new ArrayList<>(Arrays.asList(1,1,1));
        List attack = new ArrayList<>(Arrays.asList(1,1,1));
        int actual = numeronService.getHitCount(answer, attack);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("答えの数列と入力数列が一致しない場合、カウントされない。")
    void getBlowCount() {
        int expected = 6;
        List answer = new ArrayList<>(Arrays.asList(1,1,1));
        List attack = new ArrayList<>(Arrays.asList(1,1,1));
        int actual = numeronService.getBlowCount(answer, attack);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("答えの数列と入力値が一致する場合、成功する")
    void addturn() {
        int expected = 0;
        int actual = numeronService.getTurn();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("答えの数列を受けとれた場合、答えの数列を返却する")
    void getAnswerList() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            List expected = new ArrayList<>(Arrays.asList(0, 1, 2));
            List actual = numeronService.init();
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    @DisplayName("ターン数を受け取れた場合、ターンを返却する")
    void getTurn() {
        int expected = 0;
        int actual = numeronService.getTurn();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が１の場合、Sのコメントを取得する")
    void getRank() {
        List expected = new ArrayList<>(Arrays.asList("S","ぅんを使い果たした。かぇりみちにお気をつけて"));
        List actual = numeronService.getRank(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が2から4の場合、Aのコメントを取得する")
    void getRank1() {
        List expected = new ArrayList<>(Arrays.asList("A","あいんしゅたいん並み"));
        List actual = numeronService.getRank(3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が5から7の場合、Bのコメントを取得する")
    void getRank2() {
        List expected = new ArrayList<>(Arrays.asList("B","やるねぇ"));
        List actual = numeronService.getRank(7);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が8から10の場合、Cのコメントを取得する")
    void getRank3() {
        List expected = new ArrayList<>(Arrays.asList("C","いっぱんじん"));
        List actual = numeronService.getRank(10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が11から13の場合、Dのコメントを取得する")
    void getRank4() {
        List expected = new ArrayList<>(Arrays.asList("D","IQ68のヒト"));
        List actual = numeronService.getRank(11);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が１４以上の場合、？？？のコメントを取得する")
    void getRank5() {
        List expected = new ArrayList<>(Arrays.asList("？？？","ちんぱんじぃ"));
        List actual = numeronService.getRank(16);
        assertThat(actual).isEqualTo(expected);
    }
}