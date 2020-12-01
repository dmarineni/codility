package com.codility.app.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTaskTest {

    DemoTask demoTask = new DemoTask();

    @Test
    void solution() {
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        assertEquals(5, demoTask.solution(A));
        A = new int[]{1, 2, 3};
        assertEquals(4, demoTask.solution(A));
        A = new int[]{-1, -3};
        assertEquals(1, demoTask.solution(A));
    }
}