package filecopy_example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.StandardCopyOption;

public class FileCopyExample {
    public static void main(String[] args) {
        Path path1 = Paths.get("src/filecopy_example/hello_world.txt");
        Path path2 = Paths.get("src/filecopy_example/hello_world_2.txt");
        try {
            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.printf("oh no: %s\n", e);
            return;
        }
    }
}
