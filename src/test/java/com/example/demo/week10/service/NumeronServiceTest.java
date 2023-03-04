package com.example.demo.week10.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
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
    @DisplayName("ランダム数値3桁が格納されるリストを返ってくること")
    void init() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2));
            List<Integer> actual = numeronService.init();
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    @DisplayName("答えの数列と入力値が一致する場合、成功する")
    void getAttackResult() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 0));
        List<Integer> test = new ArrayList<>(Arrays.asList(0, 1, 2));
        List<Integer> actual = numeronService.getAttackResult(test, "012");
        assertThat(actual).isEqualTo(expected);
    }


    @Nested
    @DisplayName("答えの数列と入力数列が数値のみ一致しない場合、カウントする。")
    class GetBlowCount {
        @Test
        void case1() {
            int expected = 1;
            List<Integer> answer = new ArrayList<>(Arrays.asList(2, 1, 4));
            List<Integer> attack = new ArrayList<>(Arrays.asList(6, 5, 1));
            int actual = numeronService.getBlowCount(answer, attack);
            assertThat(actual).isEqualTo(expected);
        }
        @Test
        void case2() {
            int expected = 1;
            List<Integer> answer = new ArrayList<>(Arrays.asList(2, 1, 4));
            List<Integer> attack = new ArrayList<>(Arrays.asList(6, 5, 1));
            int actual = numeronService.getBlowCount(answer, attack);
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    @DisplayName("getTurnが呼び出される度にturnが増加すること")
    void addturn() {
        int expected = 1;
        int beforeTurn = numeronService.getTurn();
        assertThat(beforeTurn).isEqualTo(0);

        numeronService.addturn();
        int actual = numeronService.getTurn();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("答えの数列を受けとれた場合、答えの数列を返却する")
    void getAnswerList() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2));
            List<Integer> actual = numeronService.init();
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
        List<String> expected = new ArrayList<>(Arrays.asList("S", "ぅんを使い果たした。かぇりみちにお気をつけて"));
        List<String> actual = numeronService.getRank(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が2から4の場合、Aのコメントを取得する")
    void getRank1() {
        List<String> expected = new ArrayList<>(Arrays.asList("A", "あいんしゅたいん並み"));
        List<String> actual = numeronService.getRank(3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が5から7の場合、Bのコメントを取得する")
    void getRank2() {
        List<String> expected = new ArrayList<>(Arrays.asList("B", "やるねぇ"));
        List<String> actual = numeronService.getRank(7);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が8から10の場合、Cのコメントを取得する")
    void getRank3() {
        List<String> expected = new ArrayList<>(Arrays.asList("C", "いっぱんじん"));
        List<String> actual = numeronService.getRank(10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が11から13の場合、Dのコメントを取得する")
    void getRank4() {
        List<String> expected = new ArrayList<>(Arrays.asList("D", "IQ68のヒト"));
        List<String> actual = numeronService.getRank(11);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が１４以上の場合、？？？のコメントを取得する")
    void getRank5() {
        List<String> expected = new ArrayList<>(Arrays.asList("？？？", "ちんぱんじぃ"));
        List<String> actual = numeronService.getRank(16);
        assertThat(actual).isEqualTo(expected);
    }
}