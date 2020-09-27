package HW_30_09_20;

public class Amoeba {
    public static void main(String[] args) {

        int amoeba = 1;

        for (int i = 3; i <= 24; i += 3) {
            amoeba *= 2;

            switch (i) {
                case 3:
                    System.out.printf("Number of cells of Amoeba after 3 hours is:  %d \n", amoeba);
                    break;
                case 6:
                    System.out.printf("Number of cells of Amoeba after 6 hours is:  %d \n", amoeba);
                    break;
                case 9:
                    System.out.printf("Number of cells of Amoeba after 9 hours is:  %d \n", amoeba);
                    break;
                case 12:
                    System.out.printf("Number of cells of Amoeba after 12 hours is:  %d \n", amoeba);
                    break;
                case 15:
                    System.out.printf("Number of cells of Amoeba after 15 hours is:  %d \n", amoeba);
                    break;
                case 18:
                    System.out.printf("Number of cells of Amoeba after 18 hours is:  %d \n", amoeba);
                    break;
                case 21:
                    System.out.printf("Number of cells of Amoeba after 21 hours is:  %d \n", amoeba);
                    break;
                case 24:
                    System.out.printf("Number of cells of Amoeba after 24 hours is:  %d \n", amoeba);
                    break;
            }

        }
    }
}
