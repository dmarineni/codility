package com.codility.app.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge1Test {
    Challenge1 challenge1 = new Challenge1();

    @Test
    void solution() {
        int[] A = new int[]{3, 2, 4, 3};
        int F = 2;
        int M = 4;
        int[] res = new int[]{6, 6};
        assertEquals(res, challenge1.solution(A, F, M));
    }

    @Test
    void solution1() {
        int[] A = new int[]{1,2,3,4};
        int F = 4;
        int M = 6;
        int[] res = new int[]{0};
        assertEquals(res, challenge1.solution(A, F, M));
    }
}