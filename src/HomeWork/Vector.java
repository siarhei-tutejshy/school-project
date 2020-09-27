package HomeWork;

import java.util.Arrays;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        System.out.println("enter size of array:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] vec = new double[n];
        for (int z = 0; z < vec.length; z++) {
            vec[z] = (Math.random() * 100 - 50);
        }
        System.out.println("Array is");
        System.out.println(Arrays.toString(vec));
        double sum = 0;
        double prod = 1.0;
        double min = vec[0];
        double max = min;
        int indMin = 0;
        int indMax = 0;
        for (int x = 0; x < vec.length; x++) {
            if (vec[x] < 0) {
                sum += vec[x];
            }
            if (vec[x] < min) {
                min = vec[x];
                indMin = x;
            }
            if (vec[x] > max) {
                max = vec[x];
                indMax = x;
            }


        }
        for (int y = (indMin + 1); y != indMax; y++) {
            prod *= vec[y];
        }
        System.out.println("sum is");
        System.out.println(sum);
        System.out.println("product is");
        System.out.println(prod);
    }


}

