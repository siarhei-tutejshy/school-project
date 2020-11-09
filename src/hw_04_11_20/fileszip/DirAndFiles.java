package hw_04_11_20.fileszip;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class DirAndFiles {
    public static void main(String[] args) {
        File dir1 = new File("E://SomeDir");
        File file1 = new File(dir1, "file1.txt");
        File file2 = new File(dir1, "file2.txt");
        File file3 = new File(dir1, "file3.txt");
        boolean created = dir1.mkdir();
        if (created) {
            System.out.printf("Directory %s has been created", dir1.getName());
            System.out.println();

        }
        String s1 = "Hello Java!";
        String s2 = "Good Bye Java!";
        String s3 = "Good Bye World";
        try (FileWriter write = new FileWriter((file1));
             FileWriter write2 = new FileWriter(file2);
             FileWriter write3 = new FileWriter(file3)) {
            write.write(s1);
            write2.write(s2);
            write3.write(s3);
            System.out.printf("Files : %s ,%s, %s have been created", file1.getName(), file2.getName(), file3.getName());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
