package learning_java;

public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        System.out.printf("%s %s\n", triangleA, triangleB);

        double areaA = triangleA.findArea();
        double areaB = triangleB.findArea();
        System.out.printf("areaA = %s areaB = %s\n", areaA, areaB);

        System.out.printf("numberOfSides = %s\n", Triangle.numberOfSides);
    }
}
