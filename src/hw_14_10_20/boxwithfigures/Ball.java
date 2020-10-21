package hw_14_10_20.boxwithfigures;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super.radius = radius;
    }

    @Override
    public double getVolume() {
        volume = (4 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of ball is " + volume);
        return super.getVolume();
    }
}
