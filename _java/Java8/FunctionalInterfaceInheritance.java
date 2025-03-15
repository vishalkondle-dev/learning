package _java.Java8;

@FunctionalInterface
interface FunctionalInterfaceInheritance extends MyFunctionalInterface {

    @Override
    String abstractMethod();

    // void newMethod(); // Error: FunctionalInterfaceInheritance is not a
    // functional interface

    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

}
