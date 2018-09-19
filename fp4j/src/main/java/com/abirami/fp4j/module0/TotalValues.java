package com.abirami.fp4j.module0;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TotalValues {
    interface Selector {
        public boolean pick(int value);
    }

    static class EvenSelector implements Selector {
        @Override
        public boolean pick(int number) {
            return number % 2 == 0;
        }
    }

    public static int totalValues_imperative(List<Integer> numbers, Selector selector) {
        int result = 0;
        for (int e : numbers) {
            if (selector.pick(e)) {
                result += e;
            }

        }
        return result;
    }

    public static int totalValues_functional(List<Integer> numbers, Predicate<Integer> selector) {
        int result = 0;
        for (int e : numbers) {
            if (selector.test(e)) result += e;

        }
        return result;
    }

    public static int totalValues_functional_simplified(List<Integer> numbers, Predicate<Integer> selector) {
        return numbers.stream().filter(selector)
                .reduce(0, Math::addExact);

    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        //imperative called imperatively
        totalValues_imperative(list, new EvenSelector());


        //imperative called with a predicate
        totalValues_imperative(list, e -> true);
        totalValues_functional(list, e -> e % 2 == 0);


    }
}
