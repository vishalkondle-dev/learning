package _java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Collections.sort : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Collections.sort with reverseOrder : " + list);

        Collections.reverse(list);
        System.out.println("Collections.reverse : " + list);

        Collections.shuffle(list);
        System.out.println("Collections.shuffle : " + list);

        Collections.swap(list, 0, 2);
        System.out.println("Collections.swap (0, 2) : " + list);

    }
}
