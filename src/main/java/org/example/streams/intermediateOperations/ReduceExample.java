package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class ReduceExample {

    public static int getMulNum() {
        List<Integer> nums = Arrays.asList(1,3,5,7);
        return nums.stream()
                .reduce(1, (a, b) -> a*b);
    }

    public static Optional<Integer> getMulNumOptinal() {
        List<Integer> nums = Arrays.asList(1,3,5,7);
        return nums.stream()
                .reduce((a, b) -> a*b);
    }

    public static Optional<Student> getMaxGpaStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        System.out.println(getMulNum());
        Optional<Integer> ans = getMulNumOptinal();
        if(ans.isPresent())
            System.out.println(ans.get());
        System.out.println(getMaxGpaStudent());
    }
}
