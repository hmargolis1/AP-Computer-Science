public class Unit2Exercises {

    public static String alarmClock(int day, boolean vacation) {
        if ((day != 0 && day != 6) && !vacation) {
            return "7:00";
        }
        if ((day != 0 && day != 6) && vacation) {
            return "10:00";
        }
        if ((day == 0 || day == 6) && !vacation) {
            return "10:00";
        }
        if ((day == 0 || day == 6) && vacation) {
            return "off";
        }
        return "";
    }

    public static boolean love6(int a, int b) {
        if (Math.abs(a) == 6 || Math.abs(b) == 6) {
            return true;
        }
        if (Math.abs(a + b) == 6) {
            return true;
        }
        if (Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && a == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        }
        if (str.charAt(0) == 'f') {
            return "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }

    public static String doubleChar(String str) {
        String newString = "";
        for (int x = 0; x < str.length(); x++) {
            newString = newString + str.charAt(x) + str.charAt(x);
        }
        return newString;

    }

    public static int countHi(String str) {
        int count = 0;
        for (int x = 1; x < str.length(); x++) {
            if (str.substring(x - 1, x + 1).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int dog = 0;
        for (int x = 2; x < str.length(); x++) {
            if (str.substring(x - 2, x + 1).equals("dog")) {
                dog++;
            }
        }
        int cat = 0;
        for (int y = 2; y < str.length(); y++) {
            if (str.substring(y - 2, y + 1).equals("cat")) {
                cat++;
            }
        }
        if (cat == dog) {
            return true;
        }
        return false;
    }

    public static String mixString(String a, String b) {
        String newString = "";
        int minLength = Math.min(a.length(), b.length());
        for (int x = 0; x < minLength; x++) {
            newString = newString + a.charAt(x) + b.charAt(x);
        }

        if (a.length() > b.length()) {
            newString = newString + a.substring(minLength);
        } else {
            newString = newString + b.substring(minLength);
        }

        return newString;
    }

    public static String repeatEnd(String str, int n) {
        String end = "";
        String result = "";
        for (int x = str.length() - n; x < str.length(); x++) {
            end = end + str.charAt(x);
        }
        for (int y = 0; y < n; y++) {
            result += end;
        }
        return result;
    }

    public static boolean endOther(String a, String b) {
        String endOfString = "";
        String endOfOtherString = "";
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (b.length() <= a.length()) {
            endOfString = a.substring(a.length() - b.length());
            if (endOfString.equals(b)) {
                return true;
            }
        }
        if (a.length() <= b.length()) {
            endOfOtherString = b.substring(b.length() - a.length());
            if (endOfOtherString.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int x = 2; x < str.length() - 1; x++) {
            if (str.substring(x - 2, x).equals("co") && str.charAt(x + 1) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[nums.length - 1];
        for (int x = 1; x < nums.length; x++) {
            if (min > Math.min(nums[x - 1], nums[x])) {
                min = Math.min(nums[x - 1], nums[x]);
            }
            if (max < Math.max(nums[x - 1], nums[x])) {
                max = Math.max(nums[x - 1], nums[x]);
            }
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int result = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == 13) {
                break;
            }
            result += nums[x];
        }
        return result;
    }

    public static int[] fizzArray(int n) {
        int[] fizzArray = new int[n];
        for (int x = 0; x < n; x++) {
            fizzArray[x] += x;
        }
        return fizzArray;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == 3) {
                count++;
                if (x + 1 < nums.length && nums[x + 1] == 3) {
                    return false;
                }
            }
        }
        if (count == 3) {
            return true;
        }
        return false;
    }

    public static String[] fizzArray2(int n) {
        if (n == 0) {
            return new String[0];
        }
        String[] fizzArray = new String[n];
        for (int x = 0; x < n; x++) {
            fizzArray[x] = "" + x;
        }
        return fizzArray;
    }

    public static int[] zeroFront(int[] nums) {
        int count = 0;
        int[] zerosArray = new int[nums.length];
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == 0) {
                zerosArray[count] = 0;
                count++;
            }
        }
        for (int y = 0; y < nums.length; y++) {
            if (nums[y] != 0) {
                zerosArray[count] = nums[y];
                count++;
            }
        }
        return zerosArray;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int newLength = 0;
        for (int x = 0; x < words.length; x++) {
            if (words[x] != target) {
                newLength++;
            }
        }
        int count = 0;
        String[] newArray = new String[newLength];
        for (int j = 0; j < words.length; j++) {
            if (words[j] != target) {
                newArray[count] = words[j];
                count++;
            }
        }
        if (newLength == 0) {
            return new String[0];
        }
        return newArray;
    }

    public static int average(int[] scores, int start, int end) {
        int firstCount = 0;
        int topPart = 0;
        for (int x = start; x < end; x++) {
            topPart += scores[x];
            firstCount++;
        }
        return topPart / firstCount;
    }

    public static int scoresAverage(int[] scores) {
        if (Unit2Exercises.average(scores, scores.length
                / 2, scores.length) < Unit2Exercises.average(scores, 0,
                        scores.length / 2)) {
            return Unit2Exercises.average(scores, 0, scores.length
                    / 2);
        }
        return Unit2Exercises.average(scores, scores.length / 2, scores.length);
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int x = 1; x < scores.length; x++) {
            if (scores[x - 1] > scores[x]) {
                return false;
            }
        }
        return true;
    }

    public static int findLargestSpecial(int[] scores) {
        int max = 0;
        for (int x = 0; x < scores.length; x++) {
            if (scores[x] % 10 == 0) {
                max = scores[x];
                break;
            }
        }
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] % 10 == 0 && max < scores[j]) {
                max = scores[j];
            }
        }
        return max;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int maxA = findLargestSpecial(a);
        int maxB = findLargestSpecial(b);
        return maxA + maxB;
    }

    public static String firstTwo(String str) {
        String result = "";
        if (str.length() == 1) {
            return str + "*";
        }
        if (str.length() < 1) {
            return "**";
        } else {
            for (int x = 0; x < 2; x++) {
                result += str.charAt(x);
            }
        }
        return result;
    }

    public static double divide(int a, int b) {
        if (a <= b && a != 0) {
            return (double) b / (double) a;
        }
        if (b < a && b != 0) {
            return (double) a / (double) b;
        }
        return 0.0;
    }
}
