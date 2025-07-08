package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static List<Student>  filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("male"))
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
