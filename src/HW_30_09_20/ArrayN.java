package HW_30_09_20;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayN {
    public static void main(String[] args) {
        System.out.println(" Enter n (size of array) more than 3");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n < 3) {
            System.out.println("n is less than 3");
        } else {
            int[] arrayN = new int[n];
            ArrayList<Integer> arrayB = new ArrayList();

            for (int i = 0; i < arrayN.length; i++) {
                arrayN[i] = (int) (Math.random() * 100);

                if (arrayN[i] % 2 == 0) {
                    arrayB.add(arrayN[i]);
                }
            }
            System.out.println("Initial Array");
            System.out.println(Arrays.toString(arrayN));

            System.out.println("Even Array:");
            System.out.println(arrayB);
        }

    }

}

