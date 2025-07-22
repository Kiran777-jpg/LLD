package org.example.comparingObjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int compareTo(Student that) {
//        return this.name.compareTo(that.name);
        int nameCompare = this.name.compareTo(that.name);
        if (nameCompare == 0) {
            return Integer.compare(this.age, that.age);
        }
        return nameCompare;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
};

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("may", 24),
                new Student("may", 22),
                new Student("nov", 22),
                new Student("april", 23),
                new Student("jan", 20)
        );
        Collections.sort(students);
        students.forEach(std -> System.out.println(std));
    }
}
