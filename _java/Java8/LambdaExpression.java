package _java.Java8;

import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Lambda Expression
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
