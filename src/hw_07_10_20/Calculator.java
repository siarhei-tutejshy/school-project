package hw_07_10_20;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Calculator {
    private double one;
    private double two;


    public Calculator(double one, double two) {
        this.one = one;
        this.two = two;
    }

    public double getOne() {
        return one;
    }

    public void setOne(double one) {
        this.one = one;
    }

    public double getTwo() {
        return two;
    }

    public void setTwo(double two) {
        this.two = two;
    }

    public double sum() {
        double sum = one + two;
        System.out.println(" the sum is" + " " + sum);
        return sum;
    }

    public double multipl() {
        double multip = one * two;
        System.out.println("the multiplication is" + " " + multip);
        return multip;
    }

    public double division() {
        double div = one / two;
        System.out.println("the multiplication is" + " " + div);
        return div;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        Calculator calculator = new Calculator(a, b);


        calculator.sum();

        calculator.multipl();

        calculator.division();

    }
}

