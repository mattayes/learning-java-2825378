public class Main {
    public static void main(String[] args) {
        final double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        printPrice(groupTotalMealPrice);

        final double individualMealPrice = groupTotalMealPrice / 5;
        System.out.printf("Total per person is %.2f\n", individualMealPrice);
    }

    private static void printPrice(double total) {
        System.out.printf("Your total meal price is %.2f\n", total);
    }

    private static double calculateTotalMealPrice(
            double listedMealPrice,
            double tipRate,
            double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;

        return listedMealPrice + tip + tax;
    }
}
