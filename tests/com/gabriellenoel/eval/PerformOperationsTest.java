package com.gabriellenoel.eval;

import org.junit.jupiter.api.Test;

import static com.gabriellenoel.eval.PerformOperations.isOdd;
import static com.gabriellenoel.eval.PerformOperations.isPrime;
import static com.gabriellenoel.eval.PerformOperations.isPalindrome;
import static com.gabriellenoel.eval.PerformOperations.applyMethod;

import static org.junit.jupiter.api.Assertions.*;

class PerformOperationsTest {

    @Test
    void isOddTest() {
        assertEquals("ODD", applyMethod(isOdd(), 3));
        assertEquals("ODD", applyMethod(isOdd(), 5));
        assertEquals("EVEN", applyMethod(isOdd(), 6));
    }

    @Test
    void isPrimeTest() {
        assertEquals("PRIME", applyMethod(isPrime(), 3));
        assertEquals("PRIME", applyMethod(isPrime(), 5));
        assertEquals("COMPOSITE", applyMethod(isPrime(), 6));
    }

    @Test
    void isPalindromeTest() {
        assertEquals("PALINDROME", applyMethod(isPalindrome(), 343));
        assertEquals("PALINDROME", applyMethod(isPalindrome(), 525));
        assertEquals("NOT PALINDROME", applyMethod(isPalindrome(), 662));
    }
}