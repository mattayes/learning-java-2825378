package directory_example;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {
    public static void main(String[] args) {
        FilenameFilter filter = (file, filename) -> filename.contains(".");
        String[] contents = new File("src/directory_example").list(filter);
        if (contents == null) {
            System.out.println("oh no");
            return;
        }
        for (String file : contents) {
            System.out.println(file);
        }

        File myDir = new File("src/directory_example/myDirectory");
        boolean created = myDir.mkdir();
        if (created) {
            System.out.println("Dir created");
        } else {
            System.out.println("Dir already exists");
        }
    }
}
