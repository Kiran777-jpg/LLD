package org.example.streams.terminalOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class CollectMapping {

    private static List<Student> students = StudentDataBase.getAllStudents();

    public static List<String> mapping() {
        return students.stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
    }

    public static void main(String[] args) {
        System.out.println(mapping());
    }
}
