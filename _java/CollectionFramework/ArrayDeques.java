package _java.CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.offer("B");
        arrayDeque.offerFirst("A");
        arrayDeque.offerLast("C");
        arrayDeque.offer("D");
        arrayDeque.offer("E");
        arrayDeque.offer("F");

        System.out.println("arrayDeque: " + arrayDeque);
        System.out.println("peek: " + arrayDeque.peek());
        System.out.println("peekFirst: " + arrayDeque.peekFirst());
        System.out.println("peekLast " + arrayDeque.peekLast());

        System.out.println("poll: " + arrayDeque.poll());
        System.out.println("pollFirst: " + arrayDeque.pollFirst());
        System.out.println("pollLast " + arrayDeque.pollLast());

        System.out.println("arrayDeque: " + arrayDeque);
    }
}
