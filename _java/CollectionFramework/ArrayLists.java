package _java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1, 15);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.contains(20));
        System.out.println(list.indexOf(20));

        list.set(0, 25);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
