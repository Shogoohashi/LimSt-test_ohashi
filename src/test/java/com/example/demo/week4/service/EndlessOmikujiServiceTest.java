package com.example.demo.week4.service;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.MockedConstruction;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockConstruction;

class EndlessOmikujiServiceTest {

    EndlessOmikujiService endlessOmikujiService = new EndlessOmikujiService();

    @Test
    @DisplayName("おみくじの結果が凶になった場合,結果を取得")
    void getResult() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            String actual = endlessOmikujiService.getResult();
            String expected = "凶";
            assertEquals(expected, actual);
        }
    }

    @Test
    @DisplayName("おみくじの結果が凶の場合,凶のコメントを取得")
    void getResultComment() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            String actual = endlessOmikujiService.getResultComment();
            String expected = "凶です、今あなたの後ろに・・・";
            assertEquals(expected, actual);
        }
    }
}