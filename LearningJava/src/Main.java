import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String question = "What is my address?";
        final String choiceOne  = "46 Delphi Drive";
        final String choiceTwo = "1450 Holgate Blvd";
        final String choiceThree = "15 Georges Way";

        String correctAnswer = choiceThree;

        System.out.printf(
        "%s\n\t(1) %s\n\t(2) %s\n\t(3) %s\n",
            question, choiceOne, choiceTwo, choiceThree
        );

        String choice = null;
        try (Scanner scanner = new Scanner(System.in)) {
            choice = scanner.nextLine();
        }
        choice = choice.toLowerCase();

        if (choice.equals(correctAnswer.toLowerCase())) {
            System.out.println("That's correct!");
        } else {
            System.out.printf("That is incorrect, the correct answer is %s\n", correctAnswer);
        }
    }
}

