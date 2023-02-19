package com.example.demo.week4.service;

import java.util.Random;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockConstruction;
import org.mockito.MockitoAnnotations;

class EndlessOmikujiServiceTest {

    EndlessOmikujiService endlessOmikujiService = new EndlessOmikujiService();

    @Test
    void おみくじの結果が凶になった場合に結果を取得() {
        try (MockedConstruction<Random> ignored = mockConstruction(Random.class,
                (mock, ctx) -> doReturn(0).when(mock).nextInt(anyInt()))) {
            String actual = endlessOmikujiService.getResult();
            String expected = "凶";
            assertEquals(expected, actual);
        }
    }
    @Test
    void getResultComment() {
    }
}