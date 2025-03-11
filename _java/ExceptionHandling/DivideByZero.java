package _java.ExceptionHandling;

public class DivideByZero {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero"); // ? This will be printed
        } finally {
            System.out.println("I am here, after executing try/catch block"); // ? This will be printed
        }
    }
}
