package hw_14_10_20.boxwithfigures;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        super.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder is " + volume);
        return super.getVolume();
    }
}
