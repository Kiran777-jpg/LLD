package org.example.streams.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipExample {

    public static Optional<Integer> limitThreeSum(List<Integer> nums) {
        return nums.stream()
                .limit(3)
                .reduce((a, b) -> a+b);
    }

    public static Optional<Integer> skipTwoSum(List<Integer> nums) {
        return nums.stream()
                .skip(2)
                .reduce((a, b) -> a+b);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,7,8,9,10);
        System.out.println(limitThreeSum(nums));
        System.out.println(skipTwoSum(nums));
    }
}