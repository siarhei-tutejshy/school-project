package hw_21_10_20.carexeption;

import java.util.Random;

public class Car {
    private String model;
    private double speed;
    private int cost;

    public Car() {
    }

    public Car(String model, double speed, int cost) {
        this.model = model;
        this.speed = speed;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void start() throws CarIsNotStartedException {
        Random ran = new Random();
        int i = ran.nextInt(20);
        if (i % 2 != 0) {
            System.out.println("Car " + getModel() + " is started");
        } else {
            throw new CarIsNotStartedException("Car " + getModel() + " cannot start");

        }
    }
}
