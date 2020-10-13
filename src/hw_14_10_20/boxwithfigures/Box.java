package hw_14_10_20.boxwithfigures;

public class Box extends Shape {
    @Override
    public double getVolume() {
        return super.getVolume();
    }

    public void Box(double volume) {
        System.out.println("Volume of box is " + volume);
        super.volume = volume;
    }

    boolean add(Shape... shape) {
        double sum = 0;
        for (int i = 1; i <= shape.length; i++) {
            sum += shape[i - 1].getVolume();
            if (sum <= volume) {
                System.out.println("In box " + i + " figures");
                System.out.println("Box can added more figures");
            }
        }
        if (sum > volume)
            System.out.println("There is no place in the Box  ");
        return false;
    }
}
