package org.example.streams.problems;

import java.util.*;
import java.util.stream.Collectors;

public class MaxInList {

    private static void usingReduce(List<Integer> list) {
        int maxi = list.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxi);
    }

    private static void usingReduceOptional(List<Integer> list) {
        Optional<Integer> maxi = list.stream()
                .reduce((a, b) -> a > b ? a : b);
        maxi.ifPresent(System.out::println);
    }

    private static void usingMax(List<Integer> list) {
        Optional<Integer> maxi = list.stream()
                        .max(Comparator.comparing(Integer::intValue));
        System.out.println(maxi);
    }

    private static void usingCollectorsMax(List<Integer> list) {
        Optional<Integer> maxi = list.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Integer::intValue)));
        System.out.println(maxi);
    }

    private static void usingMaxArr(int[] arr) {
        OptionalInt ans=Arrays.stream(arr)
                .max();
        System.out.println(ans);
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int[] arr = {10,15,8,49,25,98,98,32,15};
        usingReduce(myList);
        usingReduceOptional(myList);
        usingMax(myList);
        usingCollectorsMax(myList);
        usingMaxArr(arr);
    }
}
