package org.example.streams.intermediateOperations;

import org.example.streams.models.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        Set<String> activities = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(activity -> activity.stream())
                .collect(Collectors.toSet());
        System.out.println(activities);
    }
}
