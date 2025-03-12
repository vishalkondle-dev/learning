package _java.ObjectOrientedProgramming;

// classes: public, default, final, abstract
// attribute/methods/constructors:  public, private, protected, default
// attribute/methods: final, static, abstract, synchronized, volatile, transient

abstract class DefaultClass {
    abstract void abstractMethod(); // only on methods in abstract class
}

public class Modifiers {
    // Access Modifiers
    private String Private = "Private"; // only accessible within the class
    public String Public = "Public"; // accessible from any other class
    protected String Protected = "Protected"; // accessible within the package & outside the package through inheritance
    String Default = "Default"; // accessible within the package

    // Non-Access Modifiers
    final String Final = "Final"; // cannot be overridden
    static String Static = "Static"; // belongs to the class, not the object

    public static void FinalMethod() { // cannot be overridden
        System.out.println("Final Method");
    }

    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        System.out.println(obj.Private);
        System.out.println(obj.Public);
        System.out.println(obj.Protected);
        System.out.println(obj.Default);
    }
}