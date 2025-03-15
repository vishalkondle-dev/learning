package _java.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllFunctions {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (n) -> n % 2 == 0;
        Function<Integer, Integer> function = (n) -> n * n;
        Consumer<Integer> consumer = (n) -> System.out.println(n);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }
    }
}
