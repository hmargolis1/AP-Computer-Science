import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        int[] upToN = new int[n];
        for (int i = 0; i < n; i++) {
            upToN[i] = nums[i];
        }
        int[] endCheck = new int[n];
        for (int j = 0; j < n; j++) {
            endCheck[j] = nums[nums.length - n + j];
        }
        for (int x = 0; x < n; x++) {
            if (upToN[x] != endCheck[x]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        int countThreeEven = 0;
        int countThreeOdd = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                countThreeEven++;
                countThreeOdd = 0;
            }
            if (nums[j] % 2 != 0) {
                countThreeOdd++;
                countThreeEven = 0;
            }
            if (countThreeEven == 3 || countThreeOdd == 3) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] nums = new int[end - start];

        for (int j = 0; j < nums.length; j++) {
            nums[j] = start + j;
        }

        // String result = "{";
        // for (int x = 0; x < nums.length - 1; x++) {
        // result += nums[x] + ", ";
        // }
        // System.out.println(result + nums[nums.length - 1] + "}");
        return nums;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        int[] nums = generateNumberSequence(start, end);
        String[] result = new String[nums.length];
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] % 3 == 0 && nums[x] % 5 == 0) {
                result[x] = "FizzBuzz";
            } else if (nums[x] % 3 == 0) {
                result[x] = "Fizz";
            } else if (nums[x] % 5 == 0) {
                result[x] = "Buzz";
            } else {
                result[x] = String.valueOf(nums[x]);
            }
        }
        // String printResult = "{";
        // for (int x = 0; x < nums.length - 1; x++) {
        // printResult += result[x] + ", ";
        // }
        // System.out.println(printResult + result[nums.length - 1] + "}");
        return result;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] % 2 == 0) {
                result[count] = nums[x];
                count++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                result[count] = nums[j];
                count++;
            }
        }
        // String printResult = "{";
        // for (int x = 0; x < nums.length - 1; x++) {
        // printResult += result[x] + ", ";
        // }
        // System.out.println(printResult + result[nums.length - 1] + "}");
        return result;
    }

    // // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        ArrayList<Integer> nonNegativeArray = new ArrayList<>();
        for (int count : nums) {
            if (count >= 0) {
                nonNegativeArray.add(count);
            }
        }
        return nonNegativeArray;

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int count : nums) {
            if (!(count >= 13) && !(count <= 19)) {
                newArray.add(count);
            }
        }
        return newArray;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> newArray = new ArrayList<>();
        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).endsWith("y") == false) {
                newArray.add(strs.get(i) + "y");
            }
        }
        return newArray;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            newArray.add(nums.get(i));
        }
        return new ArrayList<>();
    }

}
