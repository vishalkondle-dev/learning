package _java.Java8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (n) -> n * n;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(5, 10));
    }
}
