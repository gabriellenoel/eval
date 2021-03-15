package com.gabriellenoel.eval;

import java.util.function.Function;

public class PerformOperations {

    // return lambda if even or odd
    public static Function<Integer, String> isOdd() {
        // tried with ternary but not working idk, changing to if/else again
        return num -> { if (num % 2 == 1) { return "ODD"; } else { return "EVEN"; } }; }

    // returns lambda for prime
    public static Function<Integer, String> isPrime() {
        return num -> { if (num <= 1) { return "COMPOSITE";
        } else { for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) return "COMPOSITE"; } return "PRIME"; } }; }

    // returns lambda for palindrome
    public static Function<Integer, String> isPalindrome() {
        // for loop reverses number and sets to rev, which is initialized first
        // if/else then compares rev to num
        return num -> { int rev = 0; int remainder; int originalNum = num;
                    for (; num != 0; num /= 10) { remainder = num % 10; rev = rev * 10 + remainder; }
                    if (rev == originalNum) { return "PALINDROME";
                    } else { return "NOT PALINDROME"; } }; }

    // apply to functional interface
    public static String applyMethod(Function<Integer, String> isMethod, int num) {
        return isMethod.apply(num);
    }

    public static void executeChoice(int[] input) {
        int testCases = input[0];
        // first number provided (or input[0]) is the number of test cases!
        for(int i=0; i < testCases; i++) {
            // loops through number of test cases
            // every odd numbered index in input (1, 3, 5) denotes which to check in switch
            switch (input[i * 2 + 1]) {
                case 1:
                    // every even number in input (2, 4, 6) denotes which number to apply method to
                    System.out.println(PerformOperations.applyMethod(PerformOperations.isOdd(), input[i * 2 + 2]));
                    break;
                case 2:
                    System.out.println(PerformOperations.applyMethod(PerformOperations.isPrime(), input[i * 2 + 2]));
                    break;
                case 3:
                    System.out.println(PerformOperations.applyMethod(PerformOperations.isPalindrome(), input[i * 2 + 2]));
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] testInput = {5, 1, 4, 2, 5, 3, 898, 1, 3, 2, 12};
        executeChoice(testInput);
    }

}
