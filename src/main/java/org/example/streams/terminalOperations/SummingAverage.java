package org.example.streams.terminalOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SummingAverage {

    public static int summingByMapToInt() {
        return StudentDataBase.getAllStudents().stream()
                .mapToInt(Student::getNoteBooks).sum();
    }

    public static int summing() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double average() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println(summingByMapToInt());
        System.out.println(summing());
        System.out.println(average());
    }
}
