package com.codility.app.utils;

import com.codility.app.models.Student;

import java.util.Comparator;

public class SortByAgeAndName implements Comparator<Student> {

    @Override
    public int compare(Student x, Student y) {
        int ageCompare = x.getAge() - y.getAge();
        int nameCompare = x.getName().compareTo(y.getName());
        return ageCompare == 0 ? nameCompare : ageCompare;
    }
}
