public class Main {
    public static void main(String[] args) {
        String out = moveCapitalLettersToFront("DweweDDSDSweDwegdW");
        System.out.println(out);
    }

    private static String moveCapitalLettersToFront(String s) {
        // Your code goes here.
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower.append(c);
            } else {
                upper.append(c);
            }
        }
        upper.append(lower);

        return upper.toString();
    }
}
