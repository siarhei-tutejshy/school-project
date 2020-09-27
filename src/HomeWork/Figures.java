package HomeWork;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter radius");
        double r = sc.nextDouble();
        double t = Math.sqrt(a * a + b * b) / 2;
        if (t <= r) {
            System.out.println("the circle cover the  hole");
        } else System.out.println("the circle doesnt cover the hole");

    }
}
