package HW_30_09_20;

public class Amoeba {
    public static void main(String[] args) {

        int amoeba = 1;

        for (int i = 3; i <= 24; i += 3) {
            amoeba *= 2;
            System.out.printf("Number of cells of Amoeba after " + i + " hours is:  %d \n", amoeba);

        }

    }
}

