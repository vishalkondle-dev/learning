package _java.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // Creating a stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4322, 9, 0, 44, 23, 433, 0, 1, 2);
        Stream<Integer> stream = list.stream();

        // String[] names = { "Vishal", "Vinod", "Arun" };
        // Stream<String> stream2 = Arrays.stream(names);

        // Stream<Integer> stream3 = Stream.of(1, 2, 3, 4);
        // Stream<Integer> stream4 = Stream.iterate(1, n -> n + 1).limit(10);
        // Stream<Integer> stream5 = Stream.generate(() -> (int) Math.random() *
        // 100).limit(10);

        // Using streams
        List<Integer> filteredList = stream
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(4)
                .skip(1)
                .toList();

        System.out.println(filteredList);

        List<Integer> collect = Stream.iterate(1, x -> x + 1)
                .limit(100)
                .filter(x -> x % 2 == 0)
                .skip(1)
                // .peek(System.out::println)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
