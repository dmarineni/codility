package com.codility.app.utils;

import com.codility.app.models.Student;

import java.util.Comparator;

public class SortByName2 implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return student.getName().compareTo(t1.getName());
    }
}
