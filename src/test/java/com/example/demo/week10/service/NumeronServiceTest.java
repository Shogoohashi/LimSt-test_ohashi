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
    @DisplayName("ランダムの数値が一致した場合、答えの数列に格納される")
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
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(1);
        test.add(1);
        List<Integer> actual = numeronService.getAttackResult(test,"012");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("答えの数列と入力数列が一致した場合、カウントする。")
    void getHitCount() {
        int expected = 3;
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        answer.add(1);
        List<Integer> attack = new ArrayList<>();
        attack.add(1);
        attack.add(1);
        attack.add(1);
        int actual = numeronService.getHitCount(answer,attack);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("答えの数列と入力数列が一致しない場合、カウントされない。")
    void getBlowCount() {
        int expected = 6;
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        answer.add(1);
        List<Integer> attack = new ArrayList<>();
        attack.add(1);
        attack.add(1);
        attack.add(1);
        int actual = numeronService.getBlowCount(answer,attack);
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
        List<String> expected = new ArrayList<>();
        expected.add("S");
        expected.add("ぅんを使い果たした。かぇりみちにお気をつけて");
        List<String> actual = numeronService.getRank(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が3の場合、Aのコメントを取得する")
    void getRank1() {
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("あいんしゅたいん並み");
        List<String> actual = numeronService.getRank(3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が7の場合、Bのコメントを取得する")
    void getRank2() {
        List<String> expected = new ArrayList<>();
        expected.add("B");
        expected.add("やるねぇ");
        List<String> actual = numeronService.getRank(7);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が10の場合、Cのコメントを取得する")
    void getRank3() {
        List<String> expected = new ArrayList<>();
        expected.add("C");
        expected.add("いっぱんじん");
        List<String> actual = numeronService.getRank(10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が11の場合、Dのコメントを取得する")
    void getRank4() {
        List<String> expected = new ArrayList<>();
        expected.add("D");
        expected.add("IQ68のヒト");
        List<String> actual = numeronService.getRank(11);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が16の場合、？？？のコメントを取得する")
    void getRank5() {
        List<String> expected = new ArrayList<>();
        expected.add("？？？");
        expected.add("ちんぱんじぃ");
        List<String> actual = numeronService.getRank(16);
        assertThat(actual).isEqualTo(expected);
    }
}