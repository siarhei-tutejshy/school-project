package hw_28_10_20.map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ivanov");
        map.put(2, "Petrov");
        map.put(3, "Malashkov");
        map.put(4, "Skygarevski");

        Set<Integer> set = map.keySet();
        Collection<String> list = map.values();
        System.out.println("Keys are" + set);
        System.out.println("Values are" + list);
        System.out.println("Map is" + map);

    }

}

