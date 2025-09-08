public class BeanbagTester 
{
    public static void main(String[] args)
    {
        System.out.println("Hello there");
        Beanbag jimboBeanbag = new Beanbag();
        System.out.println(jimboBeanbag.toString());
        jimboBeanbag.sit();
        jimboBeanbag.jump();
        jimboBeanbag.push();
        jimboBeanbag.tear();
        System.out.println(jimboBeanbag.toString());
        Beanbag testBeanbag1 = new Beanbag();
        testBeanbag1.sit();
        testBeanbag1.jump();
        testBeanbag1.push();
        testBeanbag1.tear();
        Beanbag testBeanbag2 = new Beanbag();
        testBeanbag2.sit();
        testBeanbag2.jump();
        testBeanbag2.push();
        testBeanbag2.tear();
        System.out.println(testBeanbag1.toString());
        System.out.println(testBeanbag2.toString());
        System.out.println(jimboBeanbag.equals(testBeanbag1));
    }
}
