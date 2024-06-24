package pathclass_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {
    public static void main(String[] args) {
        Path path = Paths.get("src/pathclass_example/hello_world.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.out.printf("oh no: %s\n", e);
            return;
        }

        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());
    }
}
