package com.gabriellenoel.eval;

import java.util.Arrays;
import java.util.List;

public class Functional {

    public static List<Integer> rightDigit(List<Integer> numberList) {
        return Arrays.asList(numberList.stream().map(num -> (num % 10)).toArray(Integer[]::new));
    }

    public static List<Integer> doubling(List<Integer> numberList) {
        return Arrays.asList(numberList.stream().map(num -> (num * 2)).toArray(Integer[]::new));
    }

    public static List<String> noX(List<String> numberList) {
        return Arrays.asList(numberList.stream().map(num -> (num.replaceAll("x", ""))).toArray(String[]::new));
    }

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 3, 5, 6, 90, 22, 30);
        List<String> letterList = Arrays.asList("aa", "bb", "ax", "bx", "xc", "dxd");
        List<Integer> rightNum = rightDigit(numberList);
        List<Integer> doubled = doubling(numberList);
        List<String> remove = noX(letterList);

        System.out.println("The input number list is: " + numberList);
        System.out.println("The input letter list is: " + letterList);
        System.out.println("The rightmost digits are: " + rightNum);
        System.out.println("The numbers doubled are: " + doubled);
        System.out.println("The letters with 'x' removed are: " + remove);
    }


}
