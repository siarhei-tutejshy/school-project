package hw_28_10_20.cashregister;

import java.util.*;

public class MainCash {
    public static void main(String[] args) {
        Map<String, Double> shopList = new HashMap<>();
        shopList.put("Bread", 12.5);
        shopList.put("Milk", 18.99);
        shopList.put("Ham", 35.50);
        shopList.put("Eggs", 40.0);
        shopList.put("Bottle of water", 15.99);
        shopList.put("Tomatoes", 17.87);
        shopList.put("Cucumbers", 20.34);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Milk");
        list1.add("Bread");
        list1.add("Cucumbers");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Eggs");
        list2.add("Bread");
        list2.add("Bottle of water");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Tomatoes");
        list3.add("Ham");
        list3.add("Bread");
        list3.add("Bottle of water");

        Buyer buy1 = new Buyer(list1);
        Buyer buy2 = new Buyer(list2);
        Buyer buy3 = new Buyer(list3);

        Queue<Buyer> queue = new ArrayDeque<>();
        queue.add(buy1);
        queue.add(buy2);
        queue.add(buy3);
        for (Buyer b : queue) {
            System.out.println("In queue " + queue.size() + " people");
            System.out.println("Check: ");
            b.cash(shopList);
            queue.remove();
            if (queue.isEmpty()) {
                System.out.println("Queue is empty");
            }
        }
    }
}
