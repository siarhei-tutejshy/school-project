package hw_07_10_20;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String typeOfProcessor;
    int sizeRAM;
    int sizeHD;

    public Computer(String typeOfProcessor, int sizeRAM, int sizeHD) {
        this.typeOfProcessor = typeOfProcessor;
        this.sizeRAM = sizeRAM;
        this.sizeHD = sizeHD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "typeOfProcessor='" + typeOfProcessor + '\'' +
                ", sizeRAM=" + sizeRAM +
                ", sizeHD=" + sizeHD +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }

    public void on(int x) {
        Random random = new Random();
        int z = random.nextInt(2);
        if (z == x) {
            System.out.println(" Computer is turn on");
        } else System.out.println("Fail. Computer was burn");
        System.out.println("Computer cant be turned on");
    }

    public void off() {
        System.out.println("Computer is turn off");
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 or  0");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Computer comp = new Computer("AMD", 8, 312);
        comp.print();
        comp.on(x);
        comp.off();
    }
}
