package org.example.streams.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnBoxing {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 6) // IntStream
                // int
                .boxed()
                // Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> nums) {
        return nums.stream()
                .mapToInt(ele -> (Integer)ele)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> nums = boxing();
        System.out.println("boxing: " + nums);
        System.out.println("unboxing mapToInt: " + unBoxing(nums));
    }
}
