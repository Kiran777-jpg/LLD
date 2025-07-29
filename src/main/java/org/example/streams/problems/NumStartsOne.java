package org.example.streams.problems;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartsOne {

    private static void usingList(List<Integer> list) {
        List<Integer> ans = list.stream()
                .map(s -> s+"")
                .filter(s -> s.startsWith("1"))
//                .map(s -> Integer.parseInt(s))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(ans);

    }

    private static void usingArr(int[] arr) {
        int[] ans = Arrays.stream(arr)
                .boxed()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(ans));

         ans = Arrays.stream(arr)
                .mapToObj(s->s+"")
                .filter(s->s.startsWith("1"))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        int[] arr = {10,15,8,49,25,98,32};
        usingList(myList);
        usingArr(arr);
    }
}
