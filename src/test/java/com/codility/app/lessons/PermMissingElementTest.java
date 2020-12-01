package com.codility.app.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElementTest {

    PermMissingElement permMissingElement = new PermMissingElement();

    @Test
    void solution() {
        int[] A = new int[]{2, 3, 1, 4};
        assertEquals(5, permMissingElement.solution(A));
    }
}