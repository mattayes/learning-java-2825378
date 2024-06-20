import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

    private static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer team time...");
        System.out.println("Type in a random work and press Enter to start");
        try (Scanner input = new Scanner(System.in)) {
            input.next();
        }
        System.out.println("It's developer tea time!");
    }
}

