public class Beanbag 
{
    private int wheels;
    private double legs;
    private boolean cushion;
    private char firstLetterOfColor;
    private String size;
    private String location;
    public Beanbag()
    {
        wheels = 4;
        legs = 3.58;
        cushion = true;
        firstLetterOfColor = 'b';
        size = "large";  
        location = "Library";
     }
     //sit, jump, push, tear
     public void sit()
     {
        wheels = 3;
        System.out.println("There is: " + wheels + " wheels after sitting.");
     }
     public void jump()
     {
        legs = 2.89;
        System.out.println("There is: " + legs + " legs after jumping.");
     }
     public void push()
     {
        size = "small";
        System.out.println("The bag in the " + location + " is: " + size + " after pushing.");
     }
     public void tear()
     {
        cushion = false;
        System.out.println("There is a cushion: " + cushion + ", after a tear.");
     }
}