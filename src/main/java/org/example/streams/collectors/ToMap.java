package org.example.streams.collectors;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();

        // get all students and map using name
        Map<String, List<String>> studentsMap = students.stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println("studentsMap = " + studentsMap);
    }
}
