package _java.Java8;

interface StaticMethodInterface {
    // static void staticMethod(); //! Error: static methods requires a body.
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

}

public class StaticMethods implements StaticMethodInterface {

    static void staticMethod() { // * Overridden static method in class.
        System.out.println("Overridden static method in class");
    }

    // @Override //! Error: static methods can't be overridden.
    // public void staticMethod() {
    // System.out.println("Overridden default method in class");
    // }

    public static void main(String[] args) {

        StaticMethods obj = new StaticMethods();
        // obj.staticMethod(); //! Error: static method can't be called using object.

        // StaticMethods.staticMethod() //! Error: static method can't be called using
        // class name.

        StaticMethodInterface.staticMethod(); // Static methods can be called only using interface name.

        obj.defaultMethod(); // Default method can be called using object.

        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.version"));

    }
}
