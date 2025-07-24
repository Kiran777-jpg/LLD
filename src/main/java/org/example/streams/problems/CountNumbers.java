package org.example.streams.problems;

import java.util.Arrays;
import java.util.List;

public class CountNumbers {

    private static void usingCount(List<Integer> list, int[] arr) {
        long count=list.stream()
                .count();
        System.out.println(count);

        count=Arrays.stream(arr)
                .count();
        System.out.println(count);
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int[] arr = {10,15,8,49,25,98,98,32,15};
        usingCount(myList, arr);
    }
}
