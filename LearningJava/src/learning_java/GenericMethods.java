package learning_java;

public class GenericMethods {
    public static void main(String[] args) {
        printShoppingList("Jam", "Bananas");
    }

//    private static void printShoppingList(String string1, String string2) {
//        System.out.println(string1);
//        System.out.println(string2);
//    }

//    private static void printShoppingList(String[] items) {
//        System.out.println("SHOPPING LIST");
//        for (int i = 0; i < items.length; i++) {
//            System.out.printf("%d: %s\n", i+1, items[i]);
//        }
//    }

    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d: %s\n", i+1, items[i]);
        }
    }
}
