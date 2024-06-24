package file_example;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        File myFile = new File("src/file_example/example.txt");
        try {
            boolean created = myFile.createNewFile();
            if (created) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException ioe) {
            System.out.println("oh no");
        }
    }
}
