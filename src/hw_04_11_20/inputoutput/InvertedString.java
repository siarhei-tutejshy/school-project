package hw_04_11_20.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InvertedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try (FileOutputStream fos = new FileOutputStream("inverted.txt")) {
            StringBuilder build = new StringBuilder(text);
            byte[] buffer = build.reverse().toString().getBytes();
            fos.write(buffer);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
