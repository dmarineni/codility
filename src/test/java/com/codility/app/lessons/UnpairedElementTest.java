package com.codility.app.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnpairedElementTest {

    UnpairedElement unpairedElement = new UnpairedElement();

    @Test
    void solution() {
        int[] A = new int[]{9, 3, 9, 3, 9, 7, 9};
        int res = unpairedElement.solution(A);
        assertEquals(7, res);
    }
}