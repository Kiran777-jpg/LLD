package org.example.streams.terminalOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class PartitioningBy {
    private static List<Student> students = StudentDataBase.getAllStudents();

    public static void partitioningBy_1() {
        Predicate<Student> gpaStudent = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> studentGradeMap = students.stream()
                .collect(Collectors.partitioningBy(gpaStudent));
        System.out.println("studentGradeMap = " + studentGradeMap);
    }

    public static void partitioningBy_2() {
        Predicate<Student> gpaStudent = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> studentGradeMap = students.stream()
                .collect(Collectors.partitioningBy(gpaStudent, Collectors.toSet()));
        System.out.println("studentGradeMap = " + studentGradeMap);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
    }
}
