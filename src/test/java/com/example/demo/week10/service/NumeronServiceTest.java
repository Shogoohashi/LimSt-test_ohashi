package com.example.demo.week10.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import org.mockito.MockedConstruction;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockConstruction;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NumeronServiceTest {

    @Spy
    NumeronService numeronService = new NumeronService();

    @Test
    @DisplayName("ランダム数値3桁が格納されるリストを返ってくること")
    void init() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            List<Integer> expected = Arrays.asList(0, 1, 2);
            List<Integer> actual = numeronService.init();
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    @DisplayName("getHitCountの戻り値とgetBlowCountの戻り値を格納したListを返す。")
    void getAttackResult() {
        doReturn(3).when(numeronService).getHitCount(anyList(), anyList());
        doReturn(1).when(numeronService).getBlowCount(anyList(), anyList());
        List<Integer> expected = Arrays.asList(3, 3);
        List<Integer> answerList = Arrays.asList(0, 1, 2);
        String attackNumber = "012";
        List<Integer> actual = numeronService.getAttackResult(answerList, attackNumber);
        assertThat(actual).isEqualTo(expected);
    }


    @Nested
    @DisplayName("answerlistの数値とattackListの数値が合っている数値をカウントする")
    class GetBlowCount {
        @Test
        void case1() {
            int expected = 1;
            List<Integer> answer = Arrays.asList(2, 1, 4);
            List<Integer> attack = Arrays.asList(6, 5, 1);
            int actual = numeronService.getBlowCount(answer, attack);
            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void case2() {
            int expected = 1;
            List<Integer> answer = Arrays.asList(2, 1, 4);
            List<Integer> attack = Arrays.asList(6, 5, 1);
            int actual = numeronService.getBlowCount(answer, attack);
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    @DisplayName("getTurnが呼び出される度にturnが1足される")
    void addturn() {
        int expected = 1;
        int beforeTurn = numeronService.getTurn();
        assertThat(beforeTurn).isEqualTo(0);

        numeronService.addturn();
        int actual = numeronService.getTurn();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("フィールド変数で宣言したanswerListの値を答えの数列を返却する")
    void getAnswerList() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            List<Integer> expected = Arrays.asList(0, 1, 2);
            List<Integer> actual = numeronService.init();
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    @DisplayName("フィールド変数で宣言したturnの値をターン数で返却する")
    void getTurn() {
        int expected = 0;
        int actual = numeronService.getTurn();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が１の場合、Sのコメントを取得する")
    void getRank() {
        List<String> expected = Arrays.asList("S", "ぅんを使い果たした。かぇりみちにお気をつけて");
        List<String> actual = numeronService.getRank(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が2から4の場合、Aのコメントを取得する")
    void getRank1() {
        List<String> expected = Arrays.asList("A", "あいんしゅたいん並み");
        List<String> actual = numeronService.getRank(3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が5から7の場合、Bのコメントを取得する")
    void getRank2() {
        List<String> expected = Arrays.asList("B", "やるねぇ");
        List<String> actual = numeronService.getRank(7);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が8から10の場合、Cのコメントを取得する")
    void getRank3() {
        List<String> expected = Arrays.asList("C", "いっぱんじん");
        List<String> actual = numeronService.getRank(10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が11から13の場合、Dのコメントを取得する")
    void getRank4() {
        List<String> expected = Arrays.asList("D", "IQ68のヒト");
        List<String> actual = numeronService.getRank(11);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("ターン数が14以上の場合、？？？のコメントを取得する")
    void getRank5() {
        List<String> expected = Arrays.asList("？？？", "ちんぱんじぃ");
        List<String> actual = numeronService.getRank(16);
        assertThat(actual).isEqualTo(expected);
    }
}