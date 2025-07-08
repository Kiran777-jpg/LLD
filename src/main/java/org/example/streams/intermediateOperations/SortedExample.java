package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDesc() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Sort students by Name: ");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Sort students by Gpa: ");
        sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Sort students by Gpa Desc: ");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}
