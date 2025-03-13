package _java.Java8;

@FunctionalInterface
public interface MyFunctionalInterface {

    // abstract method
    void abstractMethod();
    // void abstractMethod1(); // Error: Multiple non-overriding abstract methods
    // found in interface MyFunctionalInterface

    // default method
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    // static method
    static void staticMethod() {
        System.out.println("Static Method");
    }

}
