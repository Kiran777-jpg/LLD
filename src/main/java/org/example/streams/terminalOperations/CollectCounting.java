package org.example.streams.terminalOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectCounting {
    private static List<Student> students = StudentDataBase.getAllStudents();

    public static long couting() {
        return students.stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(couting());
    }
}
