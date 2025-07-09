package org.example.streams.terminalOperations;

import org.example.streams.models.Student;
import org.example.streams.models.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {

    private static List<Student> students = StudentDataBase.getAllStudents();

    public static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap = students.stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println("studentMap = " + studentMap);
    }

    public static void groupStudentsCustomize() {
        Map<String, List<Student>> studentMap = students.stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println("studentMap = " + studentMap);
    }

    public static void twoLevelGroupingBy_1() {
        Map<Integer, Map<String, List<Student>>> studentsMap = students.stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentsMap);
    }

    public static void twoLevelGroupingBy_2() {
            Map<String, Integer> stringIntegerMap = students.stream()
                        .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(stringIntegerMap);
    }

    public static void threeArgumentGroupingBy() {
        Map<String, List<Student>> studentsMap = students.stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toList()));
        System.out.println(studentsMap);
    }

    public static void calculateMaxGpa() {
//        Map<Integer, Optional<Student>> maxGradeStudentInGrade = students.stream()
//                .collect(Collectors.groupingBy(Student::getGradeLevel,
//                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));
//        System.out.println(maxGradeStudentInGrade);

        Map<Integer, Student> maxGradeStudentInGrade_2 = students.stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(maxGradeStudentInGrade_2);
    }

    public static void calculateMinGpa() {
//        Map<Integer, Optional<Student>> minGradeStudentInGrade = students.stream()
//                .collect(Collectors.groupingBy(Student::getGradeLevel,
//                        Collectors.minBy(Comparator.comparing(Student::getGpa))));
//        System.out.println(maxGradeStudentInGrade);

        Map<Integer, Student> minGradeStudentInGrade_2 = students.stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(minGradeStudentInGrade_2);
    }



    public static void main(String[] args) {
//        groupStudentsByGender();
//        groupStudentsCustomize();
//        twoLevelGroupingBy_1();
//        twoLevelGroupingBy_2();
//        threeArgumentGroupingBy();
//        calculateMaxGpa();
        calculateMinGpa();
    }
}
