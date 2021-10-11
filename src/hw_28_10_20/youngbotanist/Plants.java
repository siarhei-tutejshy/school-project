package hw_28_10_20.youngbotanist;

import java.util.HashMap;
import java.util.Map;

public class Plants {
    public static void main(String[] args) {
        Map<String, String> plants = new HashMap<>();
        plants.put("Watermelon", "Berry");
        plants.put("Pineapple", "Fruit");
        plants.put("Tomato", "Vegetable");
        plants.put("Champignon", "Mushrooms");
        plants.put("Spruce", "Tree");

        for (Map.Entry<String, String> i : plants.entrySet()) {

            System.out.println("Type: " + i.getValue() + " - example: " + i.getKey());
        }
        System.out.println();
        System.out.println(plants.get("Watermelon"));

    }
}
