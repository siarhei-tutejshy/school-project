package HomeWork;


import java.util.Random;

public class RaggedArray {
    public static void main(String[] args) {
        Random ran = new Random();

        int[][] rag = new int[4][];

        for (int x = 0; x < rag.length; x++) {
            int i = ran.nextInt(10) + 1;
            rag[x] = new int[i];
            for (int z = 0; z < rag[x].length; z++) {
                rag[x][z] = (int) (Math.random() * 100);
                System.out.print(rag[x][z] + "\t");
            }
            System.out.println();
        }

    }
}
