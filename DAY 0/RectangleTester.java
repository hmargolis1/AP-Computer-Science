public class RectangleTester 
{
    public static void main(String[] args) 
    {
        //declaration: type name + inisialization: new type()
        Rectangle rec1 = new Rectangle(9,8 );
        System.out.println("Length: " + rec1.getLength());
        System.out.println("Width: " + rec1.getWidth());
        System.out.println("Area: " + rec1.findArea());
        System.out.println("Perimeter: " + rec1.findPerimeter());
        System.out.println("Diagonal: " + rec1.findDiagonal());
        rec1.setLength(15);
        rec1.setWidth(9);
        System.out.println("Length: " + rec1.getLength());
        System.out.println("Width: " + rec1.getWidth());
        System.out.println("Area: " + rec1.findArea());
        System.out.println("Perimeter: " + rec1.findPerimeter());
        System.out.println("Diagonal: " + rec1.findDiagonal());
    }
}
