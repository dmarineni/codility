package com.codility.app.utils;

import com.codility.app.models.Student;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student x, Student y) {
        return x.getRollNo() - y.getRollNo();
    }
}
