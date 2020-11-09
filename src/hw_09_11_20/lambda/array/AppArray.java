package hw_09_11_20.lambda.array;

public class AppArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 14, 15, 5, 16, 8, 7, 11, 0, 19};
        print(nums, PrintHelper::printNumbers);
    }

    private static void print(int[] numbers, Print p) {
        for (int i : numbers) {
            p.print(i);
        }
    }
}
