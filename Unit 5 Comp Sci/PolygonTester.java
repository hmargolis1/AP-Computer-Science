public class PolygonTester {
    public static void main(String[] args) {
        testRectangle();
        testSquare();
        testTriangle();
    }

    public static void testRectangle() {
        Rectangle r = new Rectangle(4, 5);
        System.out.println(r);
    }

    public static void testSquare() {
        Square s = new Square(4);
        System.out.println(s);
    }

    public static void testTriangle() {
        Triangle t = new Triangle(4, 5);
        System.out.println(t);
    }
}
