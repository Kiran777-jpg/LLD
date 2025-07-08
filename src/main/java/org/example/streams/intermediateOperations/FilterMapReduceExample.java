package org.example.streams.intermediateOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

public class FilterMapReduceExample {

    public static int getNotebooksCount() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3.6)
                .map(Student::getNoteBooks)
//                .reduce(0, (a, b) -> a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(getNotebooksCount());
    }
}
