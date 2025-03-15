package _java.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        Consumer<List<Integer>> consumer1 = (list) -> {
            for (int i : list) {
                System.out.println(i);
            }
        };
        Consumer<List<Integer>> consumer2 = (list) -> {
            for (int i : list) {
                System.out.println(i + 100);
            }
        };
        consumer1.andThen(consumer2).accept(Arrays.asList(1, 2, 3, 4));
        System.out.println("-----");
        consumer1.accept(Arrays.asList(1, 2, 3, 4));
        consumer2.accept(Arrays.asList(1, 2, 3, 4));
    }
}
