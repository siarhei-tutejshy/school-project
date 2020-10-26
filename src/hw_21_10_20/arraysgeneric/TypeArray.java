package hw_21_10_20.arraysgeneric;

import java.util.Scanner;

public class TypeArray {
    public static <T> void el(String s, T[] array, int x) {

        T[] t = array;
        ArrayValues<T> el = new ArrayValues<>();
        el.setArray(t);
        System.out.print(s + "index " + x + "is ");
        System.out.print(el.getArrayIndex(x));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] s = {"Array", "Type"};
        el("String ", s, x);
        Double[] d = {12.5, 13.1, 8.9};
        el("double ", d, x);
    }
}
