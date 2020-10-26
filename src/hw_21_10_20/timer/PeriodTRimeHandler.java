package hw_21_10_20.timer;

public class PeriodTRimeHandler implements TimeHandler {
    @Override
    public void execute() throws InterruptedException {
        while (true) {
            Thread.sleep(10 * 1000);
            System.out.println("10 seconds passed");
        }
    }
}
