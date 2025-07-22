package org.example.comparingObjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        Comparator<Student> comparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        };

        Comparator<Student> comparatorNameAge = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int nameCompare = s1.getName().compareTo(s2.getName());
                if (nameCompare == 0) {
                    return s1.getAge() - s2.getAge();
                }
                return nameCompare;
            }
        };

        List<Student> students = Arrays.asList(
                new Student("may", 24),
                new Student("may", 22),
                new Student("nov", 22),
                new Student("april", 23),
                new Student("jan", 20)
        );
//        students.sort(comparator);
        Collections.sort(students, comparatorNameAge);
        students.forEach(System.out::println);
    }
}
