package hw_09_11_20.threads;

import java.util.*;

public class StoreApp {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> list = Arrays.asList("bread", "milk", "pork", "water", "eggs", "ham", "corn flakes", "mushrooms");

        List<CashDesk> cash = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cash.add(new CashDesk("cashdesk" + (i + 1)));
        }

        for (int i = 1; i < 10; i++) {

            Thread t = new Thread(new Buyer(cash.get(random.nextInt(3)), list));
            t.setName("Buyer" + i);
            t.start();
        }

    }
}

