package scanner_example;

public class Person {
    private final String name;
    private final int age;
    private final long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.printf("Person created. %s\n", this.toString());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Phone number: %d", name, age, phoneNumber);
    }
}
