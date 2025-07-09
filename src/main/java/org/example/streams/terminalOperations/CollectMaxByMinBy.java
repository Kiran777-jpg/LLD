package org.example.streams.terminalOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectMaxByMinBy {

    public static Optional<Student> max_1() {
        return StudentDataBase.getAllStudents().stream()
                .max(Comparator.comparing(Student::getGpa));
    }

    public static Optional<Student> maxBy() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> minBy() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(max_1());
        System.out.println(maxBy());
        System.out.println(minBy());
    }
}
