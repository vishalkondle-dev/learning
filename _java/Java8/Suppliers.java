package _java.Java8;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());
    }
}
