package com.codility.app.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    CyclicRotation cyclicRotation = new CyclicRotation();
    @Test
    void solution() {
        int[] A = new int[]{3, 8, 9, 7, 6};
        int k = 3;
        int[] res = new int[]{9, 7, 6, 3, 8};
        assertEquals(res, cyclicRotation.solution(A, k));
    }
}