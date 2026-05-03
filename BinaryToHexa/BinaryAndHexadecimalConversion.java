
public class BinaryAndHexadecimalConversion {

    // Given an int, returns the binary representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToBinary(int num) {
        String result = "";
        while (num > 0) {
            if ((num) % 2 == 0) {
                result += "0";
            } else {
                result += "1";
            }
            num /= 2;
        }
        // if (result.length() % 2 != 0) {
        // result
        // }
        return result;
    }

    // Given a String of a binary representation of an int, returns that int
    // Precondition: binary string is not negative
    public static int convertBinaryToInt(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(2, i);
            }
        }
        return result;
    }

    // Given an int, returns the hexadecimal representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToHexadecimal(int num) {
        String result = "";
        String numString = Integer.toString(num);
        for (int i = 0; i < Integer.toString(num).length(); i++) {
            int remainder = (numString.charAt(i) - '0') - (num);
            if (remainder >= 10) {
                remainder += 55;
                result += "" + (char) remainder;
            } else {
                result += numString.charAt(i);
            }
            num /= 16;
        }
        return result;
    }

    // Given a String of a hexadecimal representation of an int, returns that int
    // Precondition: hexadecimal string is not negative
    public static int convertHexadecimalToInt(String hex) {
        // for (int i = 0; i < len; i++) {
        // result += "" + Math.pow(16, i);
        // }
        return 0;
    }

    // Given a String of a hexadecimal representation of an int,
    // returns the String of the binary representation
    // Precondition: hexadecimal string is not negative
    public static String convertHexadecimalToBinary(String hex) {
        return "";
    }

    // Given a String of a binary representation of an int,
    // returns the String of the hexadecimal representation
    // Precondition: hexadecimal string is not negative
    public static String convertBinaryToHexadecimal(String binary) {
        return "";
    }

    // Converts the String representation of the number to an int.
    // If the String starts with 0b, then convert the rest of the String as if it
    // were binary.
    // If the String starts with 0x, then convert the rest of the String as if it
    // were hexadecimal.
    // If the String starts with neither, then convert the rest of the String as if
    // it were decimal.
    public static int convertStringToInt(String numString) {
        return 0;
    }
}
