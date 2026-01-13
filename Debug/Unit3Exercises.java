public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    // Added null check removed bad count logic.
    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null || strs.length == 0) {
            return 0.0;
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                sum += strs[i].length();
            } else {
                count++;
            }
        }
        return sum / (strs.length - count);
    }

    // Intended: produce a new string with the characters of the input reversed.
    // Added nullCheck, removed "right - 1", and removed unnessescary if statement.
    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    // removed random even odd if statement, threw IllegalArgumentException, and
    // adjusted how the max was created.
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException();
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                throw new IllegalArgumentException();
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    // Used reverse string to rewrite method, the issue before was in the int right
    // declaration, while, and return statements.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException();
        }
        if (Unit3Exercises.reverseString(str).equals(str)) {
            return true;
        }
        return false;
    }

    // Intended: sum only the even numbers in the array.
    // removed unnessescary if statement, and corrected the way sum adds the
    // numbers/ the loop itself
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                if (numbers[i] % 2 == 0) {
                    sum += numbers[i];
                }
            }
        }
        return sum;
    }

    // added null check and made i = 0
    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("That's null, not good.");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    // fixed negative check and threw IllegalArgumentException.
    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Super confused on how to print it in tester, so I wrote a print statment
    // Corrected < to >, added null check
    public static void sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // corrected >= to >, and null check
    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException();
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    // added negative check
    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    // For these 5 I added null check and try catch for different exceptions
    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        if (number > 0) {
            return number;
        }
        number = 1;
        throw new NumberFormatException();
    }

    public static String getArrayElement(String[] arr, int index) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        if (index > arr.length) {
            throw new NumberFormatException();
        }
        return arr[index];

    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Double.Nan");
        }
        return Math.sqrt(number);

    }

    public static int sumArrayElements(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("For a Null Array");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static double calculatePower(double base, int exponent) {
        try {
            if (exponent < 0) {
                throw new IllegalArgumentException();
            }
            return Math.pow(base, exponent);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return 1.0;
        }
    }

}
