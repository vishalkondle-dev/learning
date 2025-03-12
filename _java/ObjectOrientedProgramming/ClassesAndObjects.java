package _java.ObjectOrientedProgramming;

// Create a HumanBeing class
class HumanBeing {
    int age = 0;

    public void setAge(int age) {
        this.age = age;
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        // Create an object of HumanBeing
        HumanBeing humanName = new HumanBeing();
        humanName.setAge(25);
        System.out.println(humanName.age);
    }
}
