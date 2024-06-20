package method_references;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);

        Shapes shapes = (Square square) -> {
            return square.calculateArea();
        };
        System.out.printf("Area: %d\n", shapes.getArea(s));

        Shapes shapes2 = Square::calculateArea;
        System.out.printf("Area: %d\n", shapes2.getArea(s));
    }
}
