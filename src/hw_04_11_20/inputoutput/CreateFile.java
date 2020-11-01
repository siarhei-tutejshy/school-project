package hw_04_11_20.inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String text = "Hello This is Java!";
        try (FileOutputStream fos = new FileOutputStream("note.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
