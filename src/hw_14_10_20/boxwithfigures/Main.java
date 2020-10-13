package hw_14_10_20.boxwithfigures;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        Pyramid pyramid = new Pyramid(3, 4);
        Ball ball = new Ball(7);
        Cylinder cylinder = new Cylinder(8, 4);

        Box box = new Box();
        box.Box(x);
        box.add(pyramid, ball, cylinder);
    }
}
