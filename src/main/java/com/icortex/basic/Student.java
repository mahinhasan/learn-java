package com.icortex.basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    String name;
    int id;
    double cgpa;
    int year;

    Student(String name, int id, double cgpa, int year) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + cgpa + " " + year;
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Mahin", 101, 3.99, 2023));
        students.add(new Student("Kamal", 103, 3.99, 2022));
        students.add(new Student("Mahin", 102, 3.29, 2021));
        students.add(new Student("Mahin", 104, 3.49, 2022));

        // Sort the list
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.cgpa, s1.cgpa) != 0) {
                    return Double.compare(s2.cgpa, s1.cgpa);
                } else if (Integer.compare(s1.year, s2.year) != 0) {
                    return Integer.compare(s1.year, s2.year);
                } else {
                    return Integer.compare(s1.id, s2.id);
                }
            }
        });

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

