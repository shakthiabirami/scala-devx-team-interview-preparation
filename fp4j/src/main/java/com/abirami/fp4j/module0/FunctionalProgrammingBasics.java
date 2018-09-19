package com.abirami.fp4j.module0;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FunctionalProgrammingBasics {
    //Imperative style of programming
    //Smells
    //1.Saying "how"
    //2.mutability
    private static boolean isPrime(int number) {
        //A number is prime if it is not divisible by any number between 2 and 1 less than the number (2...number-1)
        //i.e A number is prime if it is only divisible by 1 and the number itself

        //Start with the iteration of the bet
        for (int i = 2; i <number; i++) {
            //If we find the number is divisible by the index we then say the number is not prime
            if (number % i == 0 )
                return false;
        }
        //then we check that the number is greater than 1 as 1 is not the prime number
        return number > 1;
    }


    //Declarative
    //1.Focus on "What"
    //2.Immutability
    private static boolean  isPrime_Functional(int number){
        return number > 1 && IntStream.range(2,number)
                .noneMatch(index -> number % index == 0);
    }

    //Making the code even more readable
    private static boolean  isPrime_Functional_1(int number){
        Predicate<Integer> isDivisible = divisor -> number % divisor == 0;
        return number > 1 && IntStream.range(2,number)
                .noneMatch(index -> number % index == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));

        System.out.println(isPrime(3));

        System.out.println(isPrime(4));

        //Find the double of the first even number greater than 3
        //Imperative style
        List<Integer> values = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
        int result = 0;
        for (int e: values) {
            if(e > 3 && e % 2 ==0 ){
                result = e*2;
                break;
            }
        }
        System.out.println(result);

        //Find the double of the first even number greater than 3
        //Functional style
        System.out.println(
        values.stream()
                .filter(e -> e > 3)
                .filter(e -> e% 2 == 0)
                .map(e -> e*2)
                .findFirst()
        );


    }


}
