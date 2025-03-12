package _java.ObjectOrientedProgramming;

// Create a Human class
class Human {
    boolean isMale;

    // ! Default Constructor
    // Even if you don't create a constructor, Java will create a default
    // constructor for you with empty body
    public Human() {
        this.isMale = true;
    }

    // Parameterized Constructor
    public Human(boolean isMale) {
        this.isMale = isMale;
    }
}

public class Constructors {

    public static void main(String[] args) {

        // Create an objects of Human

        Human arun = new Human();
        System.out.println(arun.isMale);

        Human anisha = new Human(false);
        System.out.println(anisha.isMale);

        Human aniket = new Human(true);
        System.out.println(aniket.isMale);
    }
}
