package com.codility.app.models;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    Address address;
    Age age;

    public Student(int rollNo, String name, Age age, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age.getAge();
    }

    public void setAge(int age) {
        this.age.setAge(age);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }
}

