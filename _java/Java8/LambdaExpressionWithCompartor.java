package _java.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionWithCompartor {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);

        // Sorting the list using lambda expression
        Collections.sort(list, (a, b) -> a - b);

        // Printing the sorted list
        list.forEach((n) -> System.out.println(n));
    }
}
