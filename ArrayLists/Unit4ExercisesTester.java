public class Unit4ExercisesTester {

    public static void main(String[] args) {
        testMatchingEndSequences();
        System.out.println("----");
        System.out.println("----");
        testHasThreeConsecutive();
        System.out.println("----");
        System.out.println("----");
        testGenerateNumberSequence();
        System.out.println("----");
        System.out.println("----");
        testFizzBuzz();
        System.out.println("----");
        System.out.println("----");
        testMoveEvenBeforeOdd();
    }

    public static void testMatchingEndSequences() {
        int[] nums = { 5, 6, 45, 99, 13, 5, 6 };
        try {
            System.out.println(Unit4Exercises.matchingEndSequences(nums, 1));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(Unit4Exercises.matchingEndSequences(nums, 2));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(Unit4Exercises.matchingEndSequences(nums, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testHasThreeConsecutive() {
        try {
            int[] nums = { 2, 1, 3, 5 };
            System.out.println(Unit4Exercises.hasThreeConsecutive(nums));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            int[] nums = { 2, 1, 2, 5 };
            System.out.println(Unit4Exercises.hasThreeConsecutive(nums));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            int[] nums = { 2, 4, 2, 5 };
            System.out.println(Unit4Exercises.hasThreeConsecutive(nums));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testGenerateNumberSequence() {
        try {
            System.out.println(Unit4Exercises.generateNumberSequence(5, 10));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(Unit4Exercises.generateNumberSequence(11, 18));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(Unit4Exercises.generateNumberSequence(1, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testFizzBuzz() {
        try {
            System.out.println(Unit4Exercises.fizzBuzz(1, 6));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(Unit4Exercises.fizzBuzz(1, 8));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(Unit4Exercises.fizzBuzz(1, 11));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testMoveEvenBeforeOdd() {
        try {
            int[] nums = { 1, 0, 1, 0, 0, 3, 1 };
            System.out.println(Unit4Exercises.moveEvenBeforeOdd(nums));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            int[] nums = { 3, 3, 2 };
            System.out.println(Unit4Exercises.moveEvenBeforeOdd(nums));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            int[] nums = { 2, 2, 2 };
            System.out.println(Unit4Exercises.moveEvenBeforeOdd(nums));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
