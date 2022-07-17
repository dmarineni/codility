package com.codility.app.lessons;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTutorial {
    Map<Integer, String> data = new TreeMap<>();
    public TreeMapTutorial(){
        data.put(10, "red");
        data.put(30, "blue");
        data.put(20, "green");
        data.put(40, "yellow");
    }
    public void getTreeMap(){
        System.out.println(this.data);
    }

    /*
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Greta", new Age(23), new Address("London")));
        students.add(new Student(121, "Glenn", new Age(40), new Address("London")));
        students.add(new Student(117, "Henry", new Age(43), new Address("London")));
        students.add(new Student(189, "Martin", new Age(23), new Address("Moscow")));

        System.out.println(students);
        Collections.sort(students, new SortByRollNo());
        System.out.println(students);

        Collections.sort(students, new SortByName<Student>());
        System.out.println(students);

        Collections.sort(students, new SortByName2());
        System.out.println(students);

        Collections.sort(students, new SortByAgeAndName());
        System.out.println(students);
    }
     */
}
