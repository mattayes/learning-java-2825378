package hashmap_example;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4, .75f, true);
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

        System.out.printf("Kevin's number: %d\n", phoneBook.get("Kevin"));

        System.out.println("List of contacts in phonebook:");
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
