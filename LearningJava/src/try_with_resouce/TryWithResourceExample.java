package try_with_resouce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;


public class TryWithResourceExample {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
                StringWriter writer = new StringWriter();){
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        } catch (IOException ioe) {

        }
    }
}
