public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String printingArray = "";
        {
            if(array == null || array.length == 0) {
                System.out.println("[]");
                return "[]";
            } else {
                String lastArrayValue = array[array.length - 1];
                    for (int x = 0; x < array.length - 1; x++) {
                        printingArray += array[x] + ", ";
                    }
                System.out.println("[" + printingArray + lastArrayValue + "]");
                return "[" + printingArray + lastArrayValue + "]";
            }
        }
    }

    /**
     * Prints the contents of an int array, separating each element with a comma
     * and enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */
    public static String printIntegerArray(int[] array) {
        String arrayBefore = "";
        if (array != null) {
            String lastValue = "" + array[array.length - 1];
            for (int x = 0; x < array.length - 1; x++) {
                arrayBefore += array[x] + ", ";
            }
            System.out.println("[" + arrayBefore + lastValue + "]");
            return "[" + arrayBefore + lastValue + "]";
        }
        return "[]";
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        if (array != null) {
            int largestValue = array[array.length - 1];
            for (int x = 0; x < array.length - 1; x++) {
                if (array[x] > largestValue) {
                    largestValue = array[x];
                }
            }
            return largestValue;
        }
        return 0;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one
     * that appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
            String largestString = array[0];
            for (int x = 0; x < array.length; x++) {
                if (largestString.length() < array[x].length()) {
                    largestString = array[x];
                }
            }
            return largestString;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
            double lastString = array[array.length - 1].length();
            double restString = 0.0;
            for (int x = 0; x < array.length - 1; x++) {
                if(array[x] == null) {
                } else {
                    restString += array[x].length();
                }
            }
            return (restString + lastString) / array.length;
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the frequency of a letter in the alphabet. The first element
     * (index 0) represents the frequency of the letter 'a', the second element
     * (index 1) represents the frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the
     *         input string.
     */
    public static int[] countLetterFrequencies(String input) {
        if (input == null) {
            return new int[0];
        }
        input = input.toUpperCase();
        int[] array = new int[26];
        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) >= 'A' && input.charAt(x) <= 'Z') {
                array[(input.charAt(x)) - 'A']++; // A is 65
            }
        }
        return array;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down
     * by one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) { // shift left
        if (array == null || index < 0 || index >= array.length) {
            return new int[0];
        }
        for (int x = index; x < array.length - 1; x++) {
            array[x] = array[x + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        } else {
            int[] newArray = new int[array.length * 2];
            for (int x = 0; x < array.length; x++) {
                newArray[x] = array[x];
            }
            for (int y = array.length; y < newArray.length; y++) {
                newArray[y] = 0;
            }
            return newArray;
        }
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning
     * of each String in the array.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added
     *         to each String
     */
    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            return new String[0];
        } else {
            for (int x = 0; x < array.length; x++) {
                array[x] = "#" + x + " " + array[x];
            }
            return array;
        }
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        } else {
            int start = 0;
            int end = array.length - 1;
            while (start < end) {
                int oldValue = array[start];
                array[start] = array[end];
                array[end] = oldValue;
                start++;
                end--;
            }
            return array;
        }
    }

}
