package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = StudentDataBase.getAllStudents().stream() // stream<Student>
                .map(Student::getName) // stream<String>
                .map(String::toUpperCase)  // stream<String>
                .collect(Collectors.toList());  // List<String>
        System.out.println(names);
    }
}
