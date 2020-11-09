package hw_09_11_20.threads;

import java.util.List;

public class Buyer extends Thread {
    CashDesk cash;
    String name;
    List<String> list;


    public Buyer(CashDesk cash, List<String> list) {
        this.cash = cash;
        this.list = list;

    }

    @Override
    public void run() {
        try {
            cash.check(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
