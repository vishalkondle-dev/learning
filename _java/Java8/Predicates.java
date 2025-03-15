package _java.Java8;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<Integer> isThalaForReason = (s) -> s % 7 == 0;
        System.out.println(isThalaForReason.test(7));
        System.out.println(isThalaForReason.test(8));

        Predicate<Integer> isEven = (s) -> s % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        Predicate<Integer> isThalaForReasonAndEven = isThalaForReason.and(isEven);
        System.out.println(isThalaForReasonAndEven.test(14));
        System.out.println(isThalaForReasonAndEven.test(21));

        Predicate<Integer> isThalaForReasonOrEven = isThalaForReason.or(isEven);
        System.out.println(isThalaForReasonOrEven.test(14));
        System.out.println(isThalaForReasonOrEven.test(21));

        Predicate<Integer> isThalaForReasonNegate = isThalaForReason.negate();
        System.out.println(isThalaForReasonNegate.test(14));
        System.out.println(isThalaForReasonNegate.test(20));
    }
}
