package _java.ExceptionHandling;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int age = 18;
        try {
            if (age < 18) {
                throw new CustomException("You are not eligible to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
            System.out.println("Voting completed");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}
