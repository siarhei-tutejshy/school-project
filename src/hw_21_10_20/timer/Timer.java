package hw_21_10_20.timer;

public class Timer {
    private TimeHandler timeHandler;

    public Timer(TimeHandler timeHandler) {
        this.timeHandler = timeHandler;
    }

    public void period() {
        timeHandler.execute();
    }
}
