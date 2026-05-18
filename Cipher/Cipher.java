public class Cipher {

    public static String encode(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        }
        // String result = ""; (Why does this one drop non-letters Mr. Theiss?)
        // for (int i = 0; i < message.length(); i++) {
        // char c = message.charAt(i);
        // if (Character.isLetter(c) && Character.isLowerCase(c)) {
        // if (c <= 119) {
        // result += (char) (c + 3);
        // } else {
        // result += (char) (c - 23);
        // }
        // } else if (Character.isLetter(c) && Character.isUpperCase(c)) {
        // if (c <= 87) {
        // result += (char) (c + 3);
        // } else {
        // result += (char) (c - 23);
        // }
        // }
        // }
        // return result;
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 3) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + 3) % 26);
            }
            result = result + c;
        }

        return result;
    }

    private static char encodeChar(char c) {
        if (Character.isLetter(c) && Character.isLowerCase(c)) {
            if (c <= 119) {
                return (char) (c + 3);
            } else {
                return (char) (c - 23);
            }
        } else if (Character.isLetter(c) && Character.isUpperCase(c)) {
            if (c <= 87) {
                return (char) (c + 3);
            } else {
                return (char) (c - 23);
            }
        }
        return c;
    }

    public static String decode(String encodedMessage) {
        if (encodedMessage == null) {
            throw new IllegalArgumentException();
        }
        String result = "";
        for (int i = 0; i < encodedMessage.length(); i++) {
            char c = encodedMessage.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' - 3 + 26) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' - 3 + 26) % 26);
            }

            result = result + c;
        }
        return result;
    }

    private static char decodeChar(char c) {
        if (Character.isLetter(c) && Character.isLowerCase(c)) {
            if (c < 100) {
                return (char) (c + 23);
            } else {
                return (char) (c - 3);
            }
        } else if (Character.isLetter(c) && Character.isUpperCase(c)) {
            if (c < 68) {
                return (char) (c + 23);
            } else {
                return (char) (c + 3);
            }
        }
        return c;
    }

    public static String compress(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        }
        if (message.length() == 0) {
            return "";
        }

        String result = "";

        char current = message.charAt(0);
        int count = 1;

        for (int i = 1; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c == current) {
                count++;
            } else {
                result = result + current;

                if (count > 1) {
                    result = result + count;
                }

                current = c;
                count = 1;
            }
        }

        result = result + current;
        if (count > 1) {
            result = result + count;
        }

        return result;
    }

    public static String decompress(String compressedMessage) {
        if (compressedMessage == null) {
            throw new IllegalArgumentException();
        }
        if (compressedMessage.length() == 0) {
            return "";
        }

        String result = "";
        int i = 0;

        while (i < compressedMessage.length()) {

            char letter = compressedMessage.charAt(i);

            if (!Character.isLetter(letter)) {
                throw new IllegalArgumentException();
            }

            i++;

            int count = 0;
            boolean hasDigits = false;

            while (i < compressedMessage.length() && Character.isDigit(compressedMessage.charAt(i))) {
                hasDigits = true;
                count = count * 10 + (compressedMessage.charAt(i) - '0');
                i++;
            }

            if (!hasDigits) {
                count = 1;
            }

            if (count <= 0) {
                throw new IllegalArgumentException();
            }

            for (int j = 0; j < count; j++) {
                result = result + letter;
            }
        }

        return result;
    }

}
