package HomeWork;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("initial Array:");
        System.out.println(Arrays.toString(arr));
        for (int k = arr.length - 1; k > 0; k--) {
            for (int j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));

    }
}





