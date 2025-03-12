package _java.ObjectOrientedProgramming;

public class This {
    int a, b;

    This() {
        System.out.println("Defualt Constructor called");
    }

    This(int a) {
        this.a = a;
        System.out.println("Single Parameter Constructor called");
        this();
    }

    This(int a, int b) {
        this.a = a;
        this.b = b;
        sum(this);
        System.out.println("Two Parameter Constructor called");
    }

    void sum(This obj) {
        System.out.println("Sum of a and b is: " + (obj.a + obj.b));
    }

    @Override
    public String toString() {
        return "This [a=" + this.a + ", b=" + this.b + "]";
    }

    public static void main(String[] args) {
        This obj1 = new This();
        This obj2 = new This(10);
        This obj3 = new This(10, 20);

        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
        System.out.println("obj3: " + obj3);
    }
}
