package org.example.streams.terminalOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class CollectJoining {

    private static List<Student> students = StudentDataBase.getAllStudents();

    public static String joining_1() {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_3() {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining_1: " + joining_1());
        System.out.println("Joining_2: " + joining_2());
        System.out.println("Joining_3: " + joining_3());
    }
}
