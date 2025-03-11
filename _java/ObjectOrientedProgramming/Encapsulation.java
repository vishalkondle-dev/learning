package _java.ObjectOrientedProgramming;

// Encapsulation is a mechanism where you restrict the access to some components in the class.
// Encapsulation can be achieved by: Declaring the class variable as private and providing public getter and setter methods to modify and view the variables values.

class Person {
    // private attribute
    private String name;

    // @Getter
    public String getName() {
        return name;
    }

    // @Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create an object of the Encapsulation class
        Person person = new Person();

        // Set the value of the name variable to "John"
        person.setName("John");

        // Get the value of the name variable
        System.out.println(person.getName());
    }
}
