package _java.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String, String> getLowerCase = (s) -> s.toLowerCase();
        Function<String, String> getFirstTwoChars = (s) -> s.substring(0, 2);

        // First it will execute getFirstTwoChars and then getLowerCase
        System.out.println(getFirstTwoChars.andThen(getLowerCase).apply("Vishal").equals("vi"));

        // First it will execute getLowerCase and then getFirstTwoChars
        System.out.println(getFirstTwoChars.compose(getLowerCase).apply("Vinod").equals("vi"));

        // Identity function returns the same input
        System.out.println(Function.identity().apply("Vishal"));

        Function<List<Student>, List<Student>> nameStartsWithV = (students) -> {
            List<Student> studentsWithV = new ArrayList<>();
            for (Student student : students) {
                if (getFirstTwoChars.andThen(getLowerCase).apply(student.getName()).equals("vi")) {
                    studentsWithV.add(student);
                }
            }
            return studentsWithV;
        };

        Student s1 = new Student("Vishal", 14);
        Student s2 = new Student("Vinod", 16);
        Student s3 = new Student("Arun", 18);

        List<Student> students = Arrays.asList(s1, s2, s3);
        System.out.println(nameStartsWithV.apply(students));
    }

    private static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Name: " + this.name + ", Age: " + this.age;
        }
    }
}
