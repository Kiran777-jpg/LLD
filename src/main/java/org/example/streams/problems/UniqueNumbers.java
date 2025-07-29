package org.example.streams.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class UniqueNumbers {

    private static void usingDistinct(List<Integer> list) {
       List<Integer> ans=list.stream()
               .distinct()
               .collect(toList());
        System.out.println(ans);
    }

    private static void usingHashset(List<Integer> list) {
        Set<Integer> set=new HashSet<>();
        list.stream()
                .filter(ele -> set.add(ele))
                .forEach(System.out::print);
        System.out.println();
    }

    private static void usingArr(int[] arr) {
        List<Integer> ansArr=Arrays.stream(arr)
                .boxed()
                .distinct()
                .toList();
        System.out.println(ansArr);
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int[] arr = {8,8,2,3,4,5,5};
        usingDistinct(myList);
        usingHashset(myList);
        usingArr(arr);
    }
}
