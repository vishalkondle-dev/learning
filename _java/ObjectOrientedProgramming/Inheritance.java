package _java.ObjectOrientedProgramming;

class InheritanceAnimal {

    // field and method of the parent class
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}

// inherit from InheritanceAnimal
class InheritanceDog extends InheritanceAnimal {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

class Inheritance {
    public static void main(String[] args) {

        // create an object of the subclass
        InheritanceDog labrador = new InheritanceDog();

        // access field of superclass
        labrador.name = "Rohu";
        labrador.display();

        // call method of superclass
        // using object of subclass
        labrador.eat();

    }
}