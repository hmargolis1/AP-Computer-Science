public class Unit3ExercisesTester {

    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        System.out.println("");
        testReverseString();
        System.out.println("");
        testCalculateSumOfSquares();
        System.out.println("");
        testFibonacci();
        System.out.println("");
        testFindMaxValue();
        System.out.println("");
        testIsPalindrome();
        System.out.println("");
        testSumEven();
        System.out.println("");
        testSortArrayDescending();
        System.out.println("");
        testFindLongestWord();
        System.out.println("");
        testInterestCalculator();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element rray
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge CAse: Null array
        try {
            letters = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testCalculateSumOfSquares() {
        int[] newIntArray = { 10, 20, 30, 40 };
        // expected: 3000
        System.out.println("Expected Exception: " + Unit3Exercises.calculateSumOfSquares(newIntArray));
        try {
            int[] nullArray = null;
            System.out.println("Expected Exception: " + Unit3Exercises.calculateSumOfSquares(nullArray));
        } catch (Exception e) {
            System.out.println("The method threw an exception as intended.");
        }
    }

    public static void testFibonacci() {
        int n = 8;
        // expected: 0, 1, 2, 3, 5, 8, 13, 21
        System.out.println("Expected 21: " + Unit3Exercises.getNthFibonacci(n));
        try {
            n = -10;
            System.out.println(Unit3Exercises.getNthFibonacci(n));
        } catch (Exception e) {
            System.out.println("This method threw an exception as intended.");
        }
    }

    public static void testFindMaxValue() {
        int[] numbers = { 10, 20, 32, 15 };
        System.out.println(Unit3Exercises.findMaxValue(numbers));
        try {
            int[] negativeNumbers = { -10, -20, -32, -15 };
            System.out.println(Unit3Exercises.findMaxValue(negativeNumbers));
        } catch (Exception e) {
            System.out.println("Threw an Exception as intended");
        }
        try {
            int[] negativeNumbersAndZero = { -10, -20, 0, -15 };
            System.out.println(Unit3Exercises.findMaxValue(negativeNumbersAndZero));
        } catch (Exception e) {
            System.out.println("Threw an Exception as intended");
        }
        try {
            int[] nullArray = null;
            System.out.println(Unit3Exercises.findMaxValue(nullArray));
        } catch (Exception e) {
            System.out.println("Threw an Exception as intended");
        }

    }

    public static void testIsPalindrome() {
        System.out.println(Unit3Exercises.isPalindrome("racecar"));
        System.out.println(Unit3Exercises.isPalindrome("hello"));
        try {
            System.out.println(Unit3Exercises.isPalindrome(null));
            System.out.println(Unit3Exercises.isPalindrome(""));
        } catch (Exception e) {
            System.out.println("Thats Null.");
            System.out.println("That String is empty.");
        }
    }

    public static void testSumEven() {
        int[] numbers = { 10, 23, 25, 100 };
        System.out.println("Expected 110: " + Unit3Exercises.sumEvenNumbers(numbers));
        int[] numbersTwo = { -10, 23, 25, -100 };
        int[] numbersThree = { 10, -23, 25, -100 };
        System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(numbersTwo));
        System.out.println("Expected 10: " + Unit3Exercises.sumEvenNumbers(numbersThree));
        try {
            Unit3Exercises.sumEvenNumbers(null);
        } catch (Exception e) {
            System.out.println("That's null.");
        }
    }

    public static void testSortArrayDescending() {
        int[] unsortedArray = { 15, 8, 35, 5, 4, 19 };
        System.out.println("Expected {35, 19, 15, 8, 5, 4}");
        Unit3Exercises.sortArrayDescending(unsortedArray);
        int[] negativeUnsortedArray = { -15, 8, 35, -5, 4, 19 };
        System.out.println("Expected {35, 19, 8, 4, -5, -15}");
        Unit3Exercises.sortArrayDescending(negativeUnsortedArray);
        try {
            unsortedArray = null;
            Unit3Exercises.sortArrayDescending(unsortedArray);
        } catch (Exception e) {
            System.out.println("Threw an exception as intended");
        }
    }

    public static void testFindLongestWord() {
        String sentenceOne = "My name is snapple";
        String sentenceTwo = "My title is Jim";
        String sentenceThree = "Wallaby oh Willaby";
        System.out.println(Unit3Exercises.findLongestWord(sentenceOne));
        System.out.println(Unit3Exercises.findLongestWord(sentenceTwo));
        System.out.println(Unit3Exercises.findLongestWord(sentenceThree));
        try {
            sentenceOne = null;
            Unit3Exercises.findLongestWord(sentenceOne);
        } catch (Exception e) {
            System.out.println("Threw an exception as intended.");
        }
    }

    public static void testInterestCalculator() {

        try {
            double principal = 1000.0;
            double rate = 5.0;
            int years = 2;

            double result = Unit3Exercises.calculateInterest(principal, rate, years);
            System.out.println("Result 1: " + result); // Expected: 1102.5

            principal = 1500.0;
            rate = 3.0;
            years = 3;

            result = Unit3Exercises.calculateInterest(principal, rate, years);
            System.out.println("Result 2: " + result); // Expected: 1639.09

            principal = 1000;
            rate = -5;
            years = 2;

            result = Unit3Exercises.calculateInterest(principal, rate, years);
            System.out.println("Result 3: " + result); // expected throw

            principal = -1000.0;
            rate = 5.0;
            years = 2;

            result = Unit3Exercises.calculateInterest(principal, rate, years);
            System.out.println("Result 3: " + result); // expected throw

        } catch (IllegalArgumentException e) {
            System.out.println("Error: threw as intended. ");
        }
    }

}