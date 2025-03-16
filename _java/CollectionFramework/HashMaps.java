package _java.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Vishal", 1);
        hashMap.put("Vinod", 2);
        hashMap.put("Arun", 3);
        System.out.println(hashMap);

        hashMap.put("Vishal", 4);
        System.out.println(hashMap);

        hashMap.putIfAbsent("Vinod", 5);
        System.out.println(hashMap);

        System.out.println("get : " + hashMap.get("Vishal"));
        System.out.println("containsKey : " + hashMap.containsKey("Vishal"));
        System.out.println("containsValue : " + hashMap.containsValue(1));
        System.out.println("size : " + hashMap.size());
        System.out.println("isEmpty : " + hashMap.isEmpty());
        System.out.println("keySet : " + hashMap.keySet());
        System.out.println("values : " + hashMap.values());

        System.out.println("remove : " + hashMap.remove("Vishal"));
        System.out.println(hashMap);
    }
}
