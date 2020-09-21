package HomeWork;

import java.util.Scanner;

public class Massive01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int x = sc.nextInt();
        int i = sc.nextInt();
        int[][] mass = new int[x][i];
        System.out.println("Array is");

        for (int k = 0; k < mass.length; k++) {
            for (int j = 0; j < mass[k].length; j++) {
                mass[k][j] = (int) (Math.random() * 100);
                System.out.print(mass[k][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("New array is");

        for (int k = 0; k < mass.length; k++) {
            for (int j = 0; j < mass[k].length; j++) {
                if (mass[k][j] % 2 == 0) {
                    mass[k][j] = 0;
                } else mass[k][j] = 1;

                System.out.print(mass[k][j] + "\t");
            }
            System.out.println();

        }
    }
}


