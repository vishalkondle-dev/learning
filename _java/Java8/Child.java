package _java.Java8;

interface Father {
    default void sayHello() {
        System.out.println("Say Hello - Father");
    }
}

interface Mother {
    default void sayHello() {
        System.out.println("Say Hello - Mother");
    }
}

public class Child implements Father, Mother {

    @Override
    public void sayHello() { // ! To resolve the ambiguity
        // Father.super.sayHello(); // To call the default method of Father interface
        // Mother.super.sayHello(); // To call the default method of Mother interface
        System.out.println("Say Hello - Child");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();
    }
}
