package hw_04_11_20.inputoutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseOrder {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("note.txt"))) {
            String s = reader.readLine();
            String[] parts = s.split(" ");
            String z = new String();
            for (int i = parts.length - 1; i >= 0; i--) {
                z += parts[i] + " ";
            }
            System.out.println(z);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
