public class Beanbag 
{
    private int wheels;
    private double legs;
    private boolean cushion;
    private char firstColor;
    private String size;
    private String location;
    public int poundsOfLining;
    public Beanbag()
    {
        wheels = 4;
        legs = 3.58;
        cushion = true;
        firstColor = 'B';
        size = "large";  
        location = "Library";
        poundsOfLining = 30;
     }
     //sit, jump, push, tear, cutLining
     public void sit()
     {
        wheels = 3;
        System.out.println("There is: " + wheels + " wheels after sitting.");
        System.out.println("Also the color's first letter is: " + firstColor);
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
     public void cutLining(int poundsToCut)
     {
      if(poundsOfLining < poundsToCut)
      {
         System.out.println("Cannot cut that much beanbag lining");
      }
      if(poundsToCut < 0)
      {
          System.out.println("Cannot cut negative pounds");
      }
      else {
         poundsOfLining-= poundsToCut;
      }

       
     }
}