package hw_21_10_20.timer;

public class MainTimer {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(new PeriodTRimeHandler());
            timer.period();
        }
    }


