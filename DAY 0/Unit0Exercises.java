// Solution: Unit 0 Exercises
public class Unit0Exercises {

    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // Testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // Output: true
        System.out.println(obj.sleepIn(true, false));  // -> true
        System.out.println(obj.sleepIn(false, true));  // -> true

        // Testing diff21() method
        System.out.println(obj.diff21(19));  // Output: 2
        System.out.println(obj.diff21(10));  // -> 11
        System.out.println(obj.diff21(21));  // -> 0

        // Testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5));   // Output: 1250.0
        System.out.println(obj.flooringCalculator(0, 3.0));     // -> 0.0
        System.out.println(obj.flooringCalculator(100, -1.5));  // -> 0.0
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return Math.abs(n - 21);
        } else {
            return 2 * Math.abs(n - 21);
        }
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        if ((pricePerSqft * (double) sqft) <= 0) {
            return 0.0;
        } else {
            return pricePerSqft * (double) sqft;
        }
    }
}