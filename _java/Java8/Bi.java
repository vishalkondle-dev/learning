package _java.Java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bi {
    public static void main(String[] args) {
        BiPredicate<String, Integer> bi = (string, length) -> string.length() == length;
        System.out.println(bi.test("Hello", 5));

        BiFunction<String, String, Integer> bi2 = (string, length) -> string.length() + length.length();
        System.out.println(bi2.apply("Hello", "World"));

        BiConsumer<String, Integer> bi3 = (string, length) -> System.out.println(string.length() == length);
        bi3.accept("Hello", 5);
    }
}
