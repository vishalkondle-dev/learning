package _java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vinod", 16));
        students.add(new Student("Arun", 18));
        students.add(new Student("Vishal", 14));
        System.out.println("students : " + students);

        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Collections.sort : " + students);

    }
}
