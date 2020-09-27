package HW_30_09_20;

public class Runner {
    public static void main(String[] args) {
        double distance = 10.0;
        double sum = 10;

        for (int i = 2; i <= 7; i++) {

            double plusDistance = distance * 0.1;
            distance += plusDistance;
            sum += distance;
        }
        System.out.printf("total distance is: %f", sum);
    }
}
