package hw_04_11_20.fileszip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class NewZip {
    public static void main(String[] args) throws IOException {
        String file1 = "E://SomeDir//file1.txt";
        String file2 = "E://SomeDir//file2.txt";
        String file3 = "E://SomeDir//file3.txt";
        List<String> filesForZip = Arrays.asList(file1, file2, file3);
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("E://SomeDir//output.zip"))) {

            for (String files : filesForZip) {
                File file = new File(files);
                FileInputStream fis = new FileInputStream(file);
                ZipEntry entry = new ZipEntry(file.getName());
                zout.putNextEntry(entry);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zout.write(buffer);
                fis.close();
                zout.closeEntry();

            }
            System.out.println("Files have been zipped ");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
