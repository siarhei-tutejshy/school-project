package hw_28_10_20.cashregister;

import java.util.ArrayList;

import java.util.Map;


public class Buyer {
    private ArrayList<String> ar;
    public Buyer(ArrayList<String> ar) {
        this.ar = ar;
    }

    public double cash(Map<String, Double> map) {

        double x = 0;
        for (Map.Entry<String, Double> i : map.entrySet()) {
            for (String s : ar) {
                if (s == i.getKey()) {
                    System.out.println(i.getKey() + " cost " + i.getValue() + " pounds");
                    x += i.getValue();
                }
            }
        }
        System.out.println("Total amount: " + x + "pounds");
        return x;
    }

}
