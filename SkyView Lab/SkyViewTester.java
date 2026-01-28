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
        try {
            double[] first = { 1.1, 2.2, 3.3, 4.4 };
            double[] second = { 1.1, 2.2, 3.3, 4.4 };
            SkyView firstSky = new SkyView(2, 2, first);
            SkyView secondSky = new SkyView(2, 2, second);
            System.out.println(firstSky.equals(secondSky));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double[] first = { 1.1, 2.2, 3.3, 4.4 };
            SkyView firstSky = new SkyView(2, 2, first);
            SkyView secondSky = new SkyView(2, 2, null);
            System.out.println(firstSky.equals(secondSky));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double[] first = { 1.1, 2.2, 3.3, 4.4 };
            double[] second = { 1.1, 2.2, 3.3, 1.0 };
            SkyView firstSky = new SkyView(2, 2, first);
            SkyView secondSky = new SkyView(2, 2, second);
            System.out.println(firstSky.equals(secondSky));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double[] second = { 1.1, 2.2, 3.3, 1.0 };
            SkyView firstSky = new SkyView(2, 2, null);
            SkyView secondSky = new SkyView(2, 2, second);
            System.out.println(firstSky.equals(secondSky));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double[] first = {};
            double[] second = { 1.1, 2.2, 3.3, 4.4 };
            SkyView firstSky = new SkyView(2, 2, first);
            SkyView secondSky = new SkyView(2, 2, second);
            System.out.println(firstSky.equals(secondSky));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testGetAverage() {
        try {
            double[] scanned = { 1.1, 2.2, 3.3, 4.4 };
            SkyView newSky = new SkyView(2, 2, scanned);
            System.out.println(newSky.getAverage(0, 1, 0, 1));

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double[] scanned = { 1.1, 2.2, 3.3, 4.4 };
            SkyView newSky = new SkyView(2, 2, scanned);
            System.out.println(newSky.getAverage(0, 0, 0, 1));

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double[] scanned = { 1.1, 2.2, 3.3, 4.4 };
            SkyView newSky = new SkyView(2, 2, scanned);
            System.out.println(newSky.getAverage(0, -1, 0, 1));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
