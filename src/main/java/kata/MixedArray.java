package kata;/*package com.crud2.storage.kata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MixedArray{

    public int sum(List<?> mixed) {

        //List<Integer> listOfIntegers = Stream.of(mixed)
               // .map(Integer::)
               // .collect(Collectors.toList());


        int sumOfMixed = Stream.of(mixed)
                .map(s ->s)
                .flatMap()
                        Integer.parseInt(s))
               // .flatMapToInt((x) -> (int) x))

        //List<Integer> integerList = convertList(mixed, s -> Integer.parseInt(s));
               // mixed.stream()
                //.mapToInt((x) -> (int) x)
               // .mapToInt(mixed, s -> Integer.parseInt(s));
                        //(n -> Integer.parseInt(String.valueOf(n)))
               .sum();
        return sumOfMixed;
    }
}*/