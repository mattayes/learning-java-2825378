package queue_example;

public class Customer {
    private boolean hasBeenServed;
    private String name;

    public Customer(String name) {
        this.hasBeenServed = false;
        this.name = name;
    }

    public void serve() {
        hasBeenServed = true;
        System.out.printf("%s has been served\n", name);
    }

    @Override
    public String toString() {
        return name;
    }
}
