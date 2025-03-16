package _java.CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();

        // Add elements to the set
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("C");

        // Print the set
        System.out.println(set);

        // Remove an element from the set
        set.remove("B");
        System.out.println(set);

        // Check if an element is in the set
        System.out.println(set.contains("A"));

        // Get the size of the set
        System.out.println(set.size());

        // Clear the set
        set.clear();
        System.out.println(set);

        // Check if the set is empty
        System.out.println(set.isEmpty());
    }
}
