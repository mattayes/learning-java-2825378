package buffered_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        File myFile = new File("src/buffered_reader/example.txt");
        System.out.println(myFile.getAbsolutePath());
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.printf("FILE DOES NOT EXIST: %s\n", e);
        }
    }
}
