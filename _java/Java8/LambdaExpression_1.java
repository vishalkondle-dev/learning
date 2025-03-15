package _java.Java8;

public class LambdaExpression_1 {
    public static void main(String[] args) {
        // MyFunctionalInterfaceChild obj = new MyFunctionalInterfaceChild();
        // System.out.println(obj.abstractMethod());

        // We dont need to create a class for implementing the interface and overriding
        // the method for interface with only one method

        // Lambda Expression
        MyFunctionalInterface obj = () -> "Lambda Expression";
        System.out.println(obj.abstractMethod());
    }
}

class MyFunctionalInterfaceChild implements MyFunctionalInterface {
    @Override
    public String abstractMethod() {
        return "Lambda Expression";
    }
}