package _java.CollectionFramework;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        Queue<String> ll = new LinkedList<String>();
        ll.offer("A");
        ll.offer("B");
        ll.offer("C");
        System.out.println("li: " + ll);
        System.out.println("peek: " + ll.peek());
        System.out.println("poll: " + ll.poll());
        System.out.println("peek: " + ll.peek());
        System.out.println("li: " + ll);
        System.out.println("contains: " + ll.contains("B"));
        System.out.println("isEmpty: " + ll.isEmpty());
        System.out.println("size: " + ll.size());

        // * other methods that will throw an exception if operation is not successful.
        // System.out.println("element: " + ll.element());
        // System.out.println("remove: " + ll.remove());
        // System.out.println("add" + ll.add("D"));
    }
}
