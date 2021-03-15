package com.gabriellenoel.eval;

import java.util.LinkedList;
import java.util.List;

public class Recursion {

    public static boolean checkIfSum(int index, Integer[] input, int targetSum) {

        for (int i = index ; i < input.length ; i++) {
            for (int j = i + 1 ; j < input.length ; j++) {
                int sum = input[i];
                if (sum == targetSum) {
                    return true;
                }

                for (int k = j; k < input.length; k++) {
                    sum+= input[k];

                    if (sum == targetSum) {
                        return true;
                    }
                }
            }
        } return false;
    }

    // method sums identical values only, leaves others as is
    public static Integer[] identicals(Integer[] input) {
        List<Integer> newArray = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                // add final value to existing sum
                newArray.add(sum + input[i]);
            } else if (input[i] == input[i + 1]) {
                // include identical values in sum
                sum += input[i];
            } else if (input[i] != input[i + 1]) {
                // adds sum of non-identical items to array and then sets sum to 0 again
                sum += input[i];
                newArray.add(sum);
                sum = 0;
            }
        }
       System.out.println(newArray);
        return newArray.toArray(new Integer[newArray.size()]);
    }

    public static boolean groupSumClump(int index, Integer[] input, int summed) {
        return Recursion.checkIfSum(index, Recursion.identicals(input), summed);
    }

    public static void main(String[] args){
        Integer[] testInput = { 1, 7, 7, 7, 5 };
//        System.out.println(groupSumClump(0, testInput, 27));
        System.out.println(groupSumClump(0, testInput, 27));
    }


}
