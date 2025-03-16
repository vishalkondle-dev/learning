package _java.CollectionFramework;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<String>();

        // Add elements to the set
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Java");

        // Print the set
        System.out.println(set);

        // Remove an element from the set
        set.remove("World");
        System.out.println(set);

        // Check if an element is in the set
        System.out.println(set.contains("Hello"));

        // Get the size of the set
        System.out.println(set.size());

        // Clear the set
        set.clear();
        System.out.println(set);

        // Check if the set is empty
        System.out.println(set.isEmpty());
    }
}
