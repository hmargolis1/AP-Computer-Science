public class Rectangle extends Polygon {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super(4);
        this.width = 3;
        this.length = 4;
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return super.toString() + "\nIt is a rectangle with a length of " + length + " and width of " + width
                + " Its area is " + getArea();
    }

}
