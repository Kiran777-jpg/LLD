package org.example.streams.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class DuplicateNumbers {

    private static void usingHashset(List<Integer> list) {
        Set<Integer> set=new HashSet<>();
        list.stream()
                .filter(ele -> !set.add(ele))
                .forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int[] arr = {8,8,2,3,4,5,5};
        usingHashset(myList);
    }
}
