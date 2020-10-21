package hw_14_10_20.boxwithfigures;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        volume = (s * h) / 3;
        System.out.println("Volume of Pyramid is " + volume);
        return super.getVolume();
    }
}
