package com.ibm.lamdas;

import java.util.Arrays;
import java.util.List;

public class streams {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.forEach((number) -> System.out.println(number));

        numbers.forEach((number) -> System.out.println(number));

        numbers.forEach((number) -> System.out.println(number));

        numbers.stream()
               .map(element -> String.valueOf(element))
               .forEach(System.out::println);

        numbers.stream()
               .map(String::valueOf)
               .forEach(System.out::println);
        

        System.out.println(numbers.stream()                
                       .reduce(0, (total, element) -> Integer.sum(total, element))
        );

        System.out.println(numbers.stream()
                       .reduce(0, Integer::sum)
        );
    }
}
