import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean valid = false;
        int inputtedNum = -1;

        try (Scanner scanner = new Scanner(System.in)) {
            while (!valid) {
                System.out.println("Pick a number between 1 and 10");
                inputtedNum = scanner.nextInt();
                if (inputtedNum >= 1 & inputtedNum <= 10) {
                    valid = true;
                }
            }
        }

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
    }
}

