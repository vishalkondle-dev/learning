package _java.ObjectOrientedProgramming;

class MethodOverridingAnimal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// MethodOverridingDog inherits MethodOverridingAnimal
class MethodOverridingDog extends MethodOverridingAnimal {

    // overriding the eat() method
    @Override // optional
    public void eat() {
        System.out.println("I eat MethodOverridingdog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class MethodOverriding {

    // ! javac _java/ObjectOrientedProgramming/MethodOverriding.java
    // ! java _java.ObjectOrientedProgramming.MethodOverriding

    public static void main(String[] args) {

        // create an object of the subclass
        MethodOverridingDog labrador = new MethodOverridingDog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}