package hw_04_11_20.fileszip;

import java.io.File;

public class RenameAndDeleteDir {
    public static void main(String[] args) {
        File dir = new File("E://SomeDir");
        File newDir = new File("E://AnotherDir");
        dir.renameTo(newDir);
        System.out.println("New name of Directory is: " + newDir.getName());
        if (newDir.isDirectory()) {
            System.out.println("Directory contains: ");
            for (File item : newDir.listFiles()) {
                System.out.println(item.getName());
                item.delete();
            }
        }

        boolean deleted = newDir.delete();
        if (deleted) {
            System.out.println("Directory has been deleted");
        }

    }
}
