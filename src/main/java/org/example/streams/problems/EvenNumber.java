package org.example.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenNumber {

    private static void evenList(List<Integer> list) {
        List<Integer> evenEleList = list.stream()
                .filter(ele -> ele%2==0)
                .collect(Collectors.toList());
        System.out.println(evenEleList);

        int[] arr = list.stream()
                .filter(n -> n%2==0)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(arr));
    }

    private static void evenArr(int[] arr) {
        int[] evenNumbers = Arrays.stream(arr)
                .filter(ele -> ele%2==0)
                .toArray();
        System.out.println(Arrays.toString(evenNumbers));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        int[] arr = {10,15,8,49,25,98,32};
        evenList(list);
        evenArr(arr);
    }
}
