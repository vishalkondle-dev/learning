package _java.CollectionFramework;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        linkedList.set(1, 10);
        System.out.println(linkedList);
        linkedList.add(1, 2);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.add(2, 3);
        System.out.println(linkedList);
        linkedList.remove(Integer.valueOf(3));
        System.out.println(linkedList);

        // Deque methods
        linkedList.poll();
        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println(linkedList);

        linkedList.offer(1);
        linkedList.offerFirst(0);
        linkedList.offerLast(2);
        System.out.println(linkedList);

        linkedList.push(3);
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);

        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.contains(1));
        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.lastIndexOf(1));
        System.out.println(linkedList.subList(1, 3));
        System.out.println(linkedList.clone());
        System.out.println(linkedList.toArray());
        System.out.println(linkedList.toArray(new Integer[linkedList.size()]));
        linkedList.clear();
        System.out.println(linkedList);
    }
}
