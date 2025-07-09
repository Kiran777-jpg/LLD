package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAny {

    private static List<Student> students = StudentDataBase.getAllStudents();

    public static Optional<Student> findFirst() {
        return students.stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    public static Optional<Student> findAny() {
        return students.stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static void main(String[] args) {

        Optional<Student> std1 = findFirst();
        if(std1.isPresent())
            System.out.println("findFirst: " + std1.get());
        else
            System.out.println("Not found");

        Optional<Student> std2 = findAny();
        if(std2.isPresent())
            System.out.println("findFirst: " + std2.get());
        else
            System.out.println("Not found");
    }
}
