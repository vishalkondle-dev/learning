package _java.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.add(1, 20);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);
        list.addAll(list2);
        System.out.println(list);

        // ! Remove
        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(30));
        System.out.println(list);

        // ! Updating
        list.set(0, 100);
        System.out.println(list);

        // ! Contains
        System.out.println(list.contains(100));
        System.out.println(list.contains(200));

        // ! Clear
        list.clear();
        System.out.println(list);

        // ! Iterating
        for (Integer i : list) {
            System.out.println(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
