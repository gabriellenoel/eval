package com.gabriellenoel.eval;

import org.junit.jupiter.api.Test;

import static com.gabriellenoel.eval.Recursion.groupSumClump;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void groupSumClumpTest() {
        Integer[] testInput = { 1, 7, 7, 7, 5 };
        assertTrue(groupSumClump(0, testInput, 27));
        assertFalse(groupSumClump(0, testInput, 28));
    }
}