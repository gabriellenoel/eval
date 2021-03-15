package com.gabriellenoel.eval;

import java.util.LinkedList;
import java.util.List;

public class Recursion {

    public static boolean checkIfSum(int start, Integer[] input, int targetSum) {
// adjacent
        for (int i = start ; i < input.length ; i++) {
            // outer loop goes for as long as the array of grouped integers is
            for (int j = i + 1 ; j < input.length ; j++) {
                // inner loop goes through array to snag adjacent value at the same time
                int sum = input[i];
                if (sum == targetSum) {
                    // returns true if sum of numbers equals target sum
                    return true;
                }

                for (int k = j; k < input.length; k++) {
                    // inner inner loop adds values to the value sum
                    sum+= input[k];

                    if (sum == targetSum) {
                        // returns true if sum of numbers equals target sum
                        return true;
                    }
                }
            } // if sum NEVER == targetSum, return false
        } return false;
    }

    // method sums identical values only, leaves others as is
    public static Integer[] identicals(Integer[] input) {
        // instructions said to do one loop to find identicals first
        List<Integer> newArray = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                // don't compare last one to adjacent, just add to sum
                newArray.add(sum + input[i]);
            } else if (input[i].equals(input[i + 1])) {
                // include identical values in sum if next to each other
                sum += input[i];
            } else if (!input[i].equals(input[i + 1])) {
                // adds sum of non-identical items and then sets sum to 0 again
                sum += input[i];
                newArray.add(sum);
                sum = 0;
            }
        }
       System.out.println(newArray);
        return newArray.toArray(new Integer[0]);
    }

    public static boolean groupSumClump(int start, Integer[] input, int summed) {
        return Recursion.checkIfSum(start, Recursion.identicals(input), summed);
    }

    public static void main(String[] args){
        Recursion recursion = new Recursion();
        Integer[] testInput = { 1, 7, 7, 7, 5 };
//        System.out.println(groupSumClump(0, testInput, 27));
        System.out.println(recursion.groupSumClump(0, testInput, 27));
    }


}
