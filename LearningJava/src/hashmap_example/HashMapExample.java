package hashmap_example;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", 12345);
        phoneBook.put("Jill", 98765);
        phoneBook.put("Brenda", 123123);
        System.out.println(phoneBook);

        phoneBook.put("Brenda", 22222);
        System.out.println(phoneBook);

        phoneBook.put(null, 0);
        System.out.println(phoneBook);

        if (phoneBook.containsKey("Kevin")) {
            phoneBook.remove("Brenda");
        }
        System.out.println(phoneBook);
    }
}
