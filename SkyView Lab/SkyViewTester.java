public class SkyViewTester {
    public static void main(String[] args) {
        testToString();
        System.out.println("\n ----- \n");
        testEquals();
        System.out.println("\n ----- \n");
        testGetAverage();
    }

    public static void testToString() {
        double[] scanned = { 1.1, 2.2, 3.3, 4.4 };
        try {
            SkyView newSky = new SkyView(2, 2, scanned);
            System.out.println(newSky.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SkyView newSky = new SkyView(2, 2, null);
            System.out.println(newSky.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SkyView newSky = new SkyView(2, -2, scanned);
            System.out.println(newSky.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SkyView newSky = new SkyView(-2, 2, scanned);
            System.out.println(newSky.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SkyView newSky = new SkyView(-2, -2, scanned);
            System.out.println(newSky.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double[] emptyArray = {};
            SkyView newSky = new SkyView(2, 2, emptyArray);
            System.out.println(newSky.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testEquals() {

    }

    public static void testGetAverage() {

    }
}
