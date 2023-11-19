package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Challenge 1
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String part : parts){
                System.out.println(part);
            }
        };

        // Challenge 2
       Function<String, String> lambdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i =0 ; i < source.length() ; i++){
                if(i % 2 ==1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        } ;

       // Challenge 3
        lambdaFunction.apply("123456789");

        // Challenge 5
        System.out.println(everySecondCharacter(lambdaFunction,"123456789" ));

        // Challenge 6
        Supplier<String> iLoveJava = () -> "I love Java!";
        String supplierResult = iLoveJava.get();

        // Challenge 9
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        topNames2015.stream().
                map(s-> Character.toUpperCase(s.charAt(0)) + s.substring(1) ).
                sorted().
                forEach( System.out::println);

        // Challenge 10
        long count =
        topNames2015.stream().
                map(s-> Character.toUpperCase(s.charAt(0)) + s.substring(1) ).
                filter( s-> s.charAt(0) == 'A' ).
                count();
        System.out.println(count);

        // Challenge 11
        topNames2015.stream()
                .map(s-> s.substring(0,1).toUpperCase() + s.substring(1) )
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    // Challenge 4
    public static String everySecondCharacter( Function<String, String> fn, String str){
        return fn.apply(str);
    }
}
