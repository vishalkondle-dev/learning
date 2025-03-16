package _java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Collections.sort : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Collections.sort with reverseOrder : " + list);

        Collections.reverse(list);
        System.out.println("Collections.reverse : " + list);

        Collections.shuffle(list);
        System.out.println("Collections.shuffle : " + list);

        Collections.swap(list, 0, 2);
        System.out.println("Collections.swap (0, 2) : " + list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Vinod", 16));
        students.add(new Student("Arun", 18));
        students.add(new Student("Vishal", 14));
        System.out.println("students : " + students);

        Collections.sort(students);
        System.out.println("Collections.sort(students) : " + students);
    }
}

class Student implements Comparable<Object> {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String toString() {
        return "Name: " + this.name + ", RollNo: " + this.rollNo;
    }

    @Override
    public int compareTo(Object o) {
        return this.rollNo - ((Student) o).rollNo;
    }
}