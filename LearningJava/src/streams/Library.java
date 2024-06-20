package streams;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();

        books
                .stream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .filter(book -> book.getTitle().startsWith("D"))
                .forEach(System.out::println);

        books
                .parallelStream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .filter(book -> book.getTitle().startsWith("D"))
                .forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book ("Joe Biden", "Dooooot"));
        books.add(new Book("Toni Morrison", "Paridise"));

        return books;
    }
}
