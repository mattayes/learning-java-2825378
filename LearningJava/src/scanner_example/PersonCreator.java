package scanner_example;

import java.util.Scanner;

public class PersonCreator {
    public static void main(String[] args) {
        String name;
        int age;
        long phoneNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the name, age, and phone number: ");
            name = scanner.next();
            age = scanner.nextInt();
            phoneNumber = scanner.nextLong();
        }


        Person p1 = new Person(name, age, phoneNumber);
        System.out.println(p1);
    }
}
