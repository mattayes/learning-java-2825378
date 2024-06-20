public class Main {
    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .08);
        calculateTotalMealPrice(25, .18, .08);
    }

    private static void calculateTotalMealPrice(
        double listedMealPrice,
        double tipRate,
        double taxRate
    ) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        System.out.printf("Your total meal price is %s\n", result);
    }
}

