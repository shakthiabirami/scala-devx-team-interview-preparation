package com.abirami.fp4j.module0;


import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45);
        System.out.println(numbers.stream()
                .mapToInt(Streams::doubleIt)
                .sum());

        System.out.println(numbers.parallelStream()
                .mapToInt(Streams::doubleIt)
                .sum());

    }

    private static int doubleIt(int number) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return number * 2;
    }
}
