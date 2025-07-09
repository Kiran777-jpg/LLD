package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println(student.getName()))
                .filter(student -> student.getGpa() > 3.6)
                .peek(student -> System.out.println(student.getName()))
                .collect(Collectors.toList());
    }
}
