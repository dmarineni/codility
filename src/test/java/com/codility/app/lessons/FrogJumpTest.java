package com.codility.app.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

    FrogJump frogJump = new FrogJump();

    @Test
    void solution() {
        assertEquals(3, frogJump.solution(10, 85, 30));
        assertEquals(2, frogJump.solution(10, 50, 30));
    }
}