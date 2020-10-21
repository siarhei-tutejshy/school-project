package hw_14_10_20.animals;

public abstract class Animals {
    protected String typeOfEating;
    protected String family;
    protected String species;

    protected int speedOfRunning(int speed) {
        System.out.println("Speed of running is " + speed);
        return speed;
    }

    abstract void  voice();;

}
