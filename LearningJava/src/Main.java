import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double area = computeArea();
        System.out.printf("Area = %.2f\n", area);
    }

    private static double computeArea() {
        System.out.println("Let's calculate the area of a triange");

        double base = 0;
        double height = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please input the base of the triange (in inches)");
            base = input.nextDouble(); // bug #1
            while (base <= 0) {
                System.out.println("That's invalid. Please input the base of the triange (in inches)");
                base = input.nextDouble();
            }

            System.out.println("Please input the height of the triange (in inches)");
            height = input.nextDouble();
            while (height <= 0) {
                System.out.println("That's invalid. Please input the height of the triange (in inches)");
                height = input.nextDouble(); // bug #2
            }
        }

        return base * height / 2;
    }
}

