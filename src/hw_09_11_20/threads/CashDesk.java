package hw_09_11_20.threads;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CashDesk {
    String name;
    Random r = new Random();

    public CashDesk(String name) {
        this.name = name;
    }

    synchronized void check(List<String> list) throws InterruptedException {
        Collections.shuffle(list);
        List<String> ran = list.subList(0, r.nextInt(5) + 2);
        System.out.printf(" on %s %s buy : %s\n", name, Thread.currentThread().getName(), ran.toString());
        Thread.sleep(1000);
    }

}
