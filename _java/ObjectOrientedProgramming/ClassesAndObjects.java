package _java.ObjectOrientedProgramming;

// Create a Human class
class Human {
    int age = 0;

    public void setAge(int age) {
        this.age = age;
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        // Create an object of Human
        Human humanName = new Human();
        humanName.setAge(25);
        System.out.println(humanName.age);
    }
}
