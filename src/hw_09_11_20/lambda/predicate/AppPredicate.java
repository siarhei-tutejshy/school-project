package hw_09_11_20.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppPredicate {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 15, 19, -6, 6, -1, -10, 0, -3, 5);
        System.out.println("Even numbers sum: " + sumAll(number, n -> n % 2 == 0));
        System.out.println("More than three numbers sum: " + sumAll(number, n -> n > 3));
        System.out.println("Odd numbers sum: " + sumAll(number, n -> n % 2 != 0));
        System.out.println("Positive numbers sum: " + sumAll(number, n -> n > 0));
        System.out.println("Negative numbers sum: " + sumAll(number, n -> n < 0));

    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (Integer n : numbers) {
            if (p.test(n)) {
                total += n;
            }
        }
        return total;
    }
}
