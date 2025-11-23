public class NameOps {
    //substring() (From when to the end or when to when (substring(1,5) index 1-5 substring(1) 1 to the end))
    //indexOf() (index at which string ("jim") ie "indexOf("J") = 0 (start index, search value))
    //charAt() (what char is at index #)
    //length() Finds the length (amount of chars)

    public static String printMethodCall(String method, String name) {
        return method + "(" + "\" + name + \" + ): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        return name.indexOf(" ", indexOfFirstSpace(name) + 1);
    }

    public static String findFirstName(String name) {
        if(indexOfFirstSpace(name)) {
            return name.substring(0, indexOfFirstSpace(name) -1);
        }
    }

    public static String findLastName(String name) {
        for (int x = 0; x < name.length(); x--) {
            if(name.charAt(x) == ' ') {
                return name.substring(x);
            }
        }
        return "";
    }

    public static String findMiddleName(String name) {
        int count = 0;
        for (int x = 0; x < name.length(); x++) {
            if(name.charAt(x) == ' ') {
                count++;
            }
        }
        if(count >= 2) {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name) - 1);
        }
        return "";
    }
}
