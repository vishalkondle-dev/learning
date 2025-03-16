package _java.CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(30);
        pq.offer(20);
        pq.offer(40);
        pq.offer(10);
        pq.offer(5);
        pq.offer(2);

        System.out.println("pq: " + pq);
        System.out.println("peek: " + pq.peek());
        System.out.println("poll: " + pq.poll());
        System.out.println("peek: " + pq.peek());
        System.out.println("pq: " + pq);

        System.out.println("\nReversed Priority Queue");
        PriorityQueue<Integer> rpq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        rpq.offer(30);
        rpq.offer(20);
        rpq.offer(40);
        rpq.offer(10);
        rpq.offer(5);
        rpq.offer(2);

        System.out.println("rpq: " + rpq);
        System.out.println("peek: " + rpq.peek());
        System.out.println("poll: " + rpq.poll());
        System.out.println("peek: " + rpq.peek());
        System.out.println("rpq: " + rpq);
    }
}
