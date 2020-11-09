package hw_04_11_20.inputoutput;

import java.io.*;

public class MainMaxMinBytes {
    public static void main(String[] args) {

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream input = new FileInputStream(bf.readLine())) {
            int max = input.read();
            int min = input.read();
            while (input.available() > 0) {
                int data = input.read();
                if (data > max) {
                    max = data;
                }
                if (data < min) {
                    min = data;
                }
            }
            System.out.println("Max byte " + max);
            System.out.println("Min byte " + min);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
