public class RectangleTester 
{
    public static void main(String[] args) 
    {
        //declaration: type name + inisialization: new type()
        Rectangle rec1 = new Rectangle(9,8 );
        Rectangle rec2 = new Rectangle(10,11 );
        Rectangle rec3 = new Rectangle();
        System.out.println(" ----- Rec1 -----");
        System.out.println("Length: " + rec1.getLength());
        System.out.println("Width: " + rec1.getWidth());
        System.out.println("Area: " + rec1.findArea());
        System.out.println("Perimeter: " + rec1.findPerimeter());
        System.out.println("Diagonal: " + rec1.findDiagonal());
        System.out.println(" ----- Rec3 -----");
        System.out.println("Length: " + rec3.getLength());
        System.out.println("Width: " + rec3.getWidth());
        System.out.println("Area: " + rec3.findArea());
        System.out.println("Perimeter: " + rec3.findPerimeter());
        System.out.println("Diagonal: " + rec3.findDiagonal());
        System.out.println(" ----- Setlengths + Change in Rec1 -----");
        rec1.setLength(15);
        rec1.setWidth(9);
        System.out.println("Length: " + rec1.getLength());
        System.out.println("Width: " + rec1.getWidth());
        System.out.println("Area: " + rec1.findArea());
        System.out.println("Perimeter: " + rec1.findPerimeter());
        System.out.println("Diagonal: " + rec1.findDiagonal());
        System.out.println(" ----- ToString & Other/Equals Method -----");
        System.out.println(rec1.toString());
        System.out.println(rec2.toString());
        System.out.println("Rec1 and Rec2 are equal: " + rec1.equals(rec2));
    }
}
