public class Rectangle 
{
    //private instance variables
    private int length;
    private int width;

    // public Rectangle()
    // {
    //     //initialize the private intance variables
    //     length = 5; 
    //     width = 8;
    // }
    //Constructor
    public Rectangle()
    {
        length = 5;
        width = 7;
    }
    public Rectangle(int length, int width)
    {
        //initialize the private instance variables
        this.length = length;
        this.width = width;
    }
    //getters 
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    //setters
    public void setLength(int newLength)
    {
        length = newLength;
        System.out.println("SetLength: " + length);
    }
    public void setWidth(int newWidth)
    {
        width = newWidth;
        System.out.println("SetWidth: " + width);
    }
    public int findArea()
    {
        return length * width;
    }
    public int findPerimeter()
    {
        return (2*length) + (2*width);
    }
    public double findDiagonal()
    {
        return Math.sqrt((length * length) + (width * width));
    }
    public String toString()
    {
        return "Length = " + length + ", and the Width = " + width + ".";
    }
    public boolean equals(Rectangle other)
    {
        if(this.length == other.length && this.width == other.width)
        {
            return true;
        }
        return false;
    }
}
