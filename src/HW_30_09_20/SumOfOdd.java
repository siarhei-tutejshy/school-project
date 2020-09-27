package HW_30_09_20;

import java.util.Arrays;

public class SumOfOdd {
    public static void main(String[] args) {

        int[] array = new int[99];
        int sum = 0;

        for (int i = 0; i < 99; i++) {
            array[i] = i + 1;

            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("sum of odd numbers are:" + " " + sum);

    }
}
