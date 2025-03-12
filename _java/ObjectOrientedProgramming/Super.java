package _java.ObjectOrientedProgramming;

class SuperAnimal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// SuperDog inherits SuperAnimal
class SuperDog extends SuperAnimal {

    // overriding the eat() method
    @Override
    public void eat() {

        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class Super {
    public static void main(String[] args) {

        // create an object of the subclass
        SuperDog labrador = new SuperDog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}