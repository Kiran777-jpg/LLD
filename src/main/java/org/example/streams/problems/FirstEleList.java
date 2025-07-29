package org.example.streams.problems;

import java.util.Arrays;
import java.util.List;

public class FirstEleList {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        int[] arr = {10,15,8,49,25,98,98,32,15};
        Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::print);
    }
}
