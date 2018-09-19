package com.abirami.fp4j.module0;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalProgrammingBasics {
    //Imperative style of programming
    //Smells
    //1.Saying "how"
    //2.mutability
    private static boolean isPrime(int number) {
        //A number is prime if it is not divisible by any number between 2 and 1 less than the number (2...number-1)
        //i.e A number is prime if it is only divisible by 1 and the number itself

        //Start with the iteration of the bet
        for (int i = 2; i < number; i++) {
            //If we find the number is divisible by the index we then say the number is not prime
            if (number % i == 0)
                return false;
        }
        //then we check that the number is greater than 1 as 1 is not the prime number
        return number > 1;
    }


    //Declarative
    //1.Focus on "What"
    //2.Immutability
    private static boolean isPrime_Functional(int number) {
        return number > 1 && IntStream.range(2, number)
                .noneMatch(index -> number % index == 0);
    }

    //Making the code even more readable
    private static boolean isPrimeFunctional(int number) {
        IntPredicate isDivisible = div -> number % div == 0;

        return (number > 1) && IntStream.range(2, number)
                .noneMatch(isDivisible);
    }


    public static void main(String[] args) {
        System.out.println(isPrimeFunctional(1));
        System.out.println(isPrimeFunctional(2));

        System.out.println(isPrimeFunctional(3));

        System.out.println(isPrimeFunctional(4));

        // Find the first integer greater than 3 and return the double value of it


        int result = 0;
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //List<Integer> numberList= Arrays.asList(3);

        // Imperative Style
        for (int element : numberList) {
            if (element > 3) {
                result = element * 2;
                break;
            }
        }
        System.out.println("Result: " + result);

        //Functional Style


        //Predicate<Integer> isGreaterThan3 = number -> number > 3;
        Function<Integer,Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;
        Stream<Integer> temp = numberList.stream()
                .filter(isGreaterThan.apply(3))
                .filter(FunctionalProgrammingBasics::isEven)
                .map(FunctionalProgrammingBasics::doubleIt);

        System.out.println(temp);
        System.out.println(temp.findFirst().get());


    }

    private static boolean isEven(int number) {
        System.out.println("Is Even :" + number);
        return number % 2 == 0;
    }

    private static int doubleIt(int number) {
        System.out.println("Double It :" + number);

        return number * 2;
    }

    private static boolean isGreaterThan3(int number) {
        System.out.println("Is greater than :" + number);

        return number > 3;
    }


}
