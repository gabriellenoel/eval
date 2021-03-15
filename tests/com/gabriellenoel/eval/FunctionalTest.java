package com.gabriellenoel.eval;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static com.gabriellenoel.eval.Functional.rightDigit;
import static com.gabriellenoel.eval.Functional.doubling;
import static com.gabriellenoel.eval.Functional.noX;

class FunctionalTest {

    @Test
    void rightDigitTest() {
        List<Integer> numberList = Arrays.asList(1, 3, 5, 6, 90, 22, 30);
        List<Integer> rightNum = rightDigit(numberList);

        List<Integer> expectedList = Arrays.asList(1, 3, 5, 6, 0, 2, 0);
        assertEquals(expectedList, rightNum);
    }

    @Test
    void doublingTest() {
        List<Integer> numberList = Arrays.asList(1, 3, 5, 6, 90, 22, 30);
        List<Integer> doubled = doubling(numberList);

        List<Integer> expectedList = Arrays.asList(2, 6, 10, 12, 180, 44, 60);
        assertEquals(expectedList, doubled);
    }

    @Test
    void noXTest() {
        List<String> letterList = Arrays.asList("aa", "bb", "ax", "bx", "xc", "dxd");
        List<String> remove = noX(letterList);

        List<String> expectedList = Arrays.asList("aa", "bb", "a", "b", "c", "dd");
        assertEquals(expectedList, remove);
    }
}