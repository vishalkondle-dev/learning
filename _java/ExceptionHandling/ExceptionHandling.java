package _java.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        // System.out.println(numbers[10]); //! This will throw an exception
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds"); // ? This will be printed
        }
    }
}
