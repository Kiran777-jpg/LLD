package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;

public class AnyAllNoneMatch {

    private static List<Student> students = StudentDataBase.getAllStudents();

    public static boolean anyMatch() {
        return students.stream()
                .anyMatch(student -> student.getGpa()>=4.0);
    }

    public static boolean allMatch() {
        return students.stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean noneMatch() {
        return students.stream()
                .noneMatch(student -> student.getGpa()>=4.1);
    }

    public static void main(String[] args) {
        System.out.println("Any Match: " + anyMatch());
        System.out.println("All Match: " + allMatch());
        System.out.println("None Match: " + noneMatch());
    }
}
