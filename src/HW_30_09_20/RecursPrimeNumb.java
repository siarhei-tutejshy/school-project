package HW_30_09_20;

import java.util.Scanner;

public class RecursPrimeNumb {
    public static boolean simple(int n, int x) {

        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % x == 0) {
            return false;
        } else if (x < n / 2) {
            return simple(n, x + 1);
        } else {
            return true;
        }

    }


    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        if (simple(p, 2))
            System.out.printf("Is number %d simple - YES", p);
        else
            System.out.printf("Is number %d simple - NO", p);

    }
}
