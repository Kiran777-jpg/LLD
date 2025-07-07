package org.example.streams;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

public class MainStream {
    public static void main(String[] args) {
        Student st = StudentDataBase.studentSupplier.get();
        System.out.println(st.getName());
    }
}
