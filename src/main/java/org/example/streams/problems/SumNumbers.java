package org.example.streams.problems;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class SumNumbers {

    private static void usingReduce(List<Integer> list) {
       int ans = list.stream()
               .reduce(0, (a, b) -> a+b);
        System.out.println(ans);
    }

    private static void usingReduceOptional(List<Integer> list) {
        Optional<Integer> ans = list.stream()
                .reduce((a, b) -> a+b);
        if(ans.isPresent())
            System.out.println(ans.get());
    }

    private static void usingSum(List<Integer> list) {
        int ans=list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(ans);
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        usingReduce(myList);
        usingReduceOptional(myList);
        usingSum(myList);
    }
}
