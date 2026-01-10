public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
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
        int hasSpace = 0;
        for (int x = 0; x < name.length(); x++) {
            if (name.charAt(x) == ' ') {
                hasSpace++;
            }
        }
        if (hasSpace > 0) {
            return name.substring(0, indexOfFirstSpace(name));
        } else {
            return name.substring(0);
        }
    }

    public static String findLastName(String name) {
        int numberOfSpaces = 0;
        for (int x = 0; x < name.length(); x++) {
            if (name.charAt(x) == ' ') {
                numberOfSpaces++;
            }
        }
        if (numberOfSpaces == 2) {
            return name.substring(indexOfSecondSpace(name) + 1);
        }
        if (numberOfSpaces == 1) {
            return name.substring(indexOfFirstSpace(name) + 1);
        }
        return "";
    }

    public static String findMiddleName(String name) {
        int numberOfSpaces = 0;
        for (int x = 0; x < name.length(); x++) {
            if (name.charAt(x) == ' ') {
                numberOfSpaces++;
            }
        }
        if (numberOfSpaces == 2) {
            return name.substring(
                    indexOfFirstSpace(name) + 1,
                    indexOfSecondSpace(name));
        }
        return "";
    }

    public static String generateLastFirstMidInitial(String name) {
        int numberOfSpaces = 0;
        for (int x = 0; x < name.length(); x++) {
            if (name.charAt(x) == ' ') {
                numberOfSpaces++;
            }
        }
        if (numberOfSpaces == 2) {
            return findLastName(name) + ", "
                    + findFirstName(name) + " "
                    + findMiddleName(name).charAt(0) + ".";
        }
        if (numberOfSpaces == 1) {
            return findLastName(name) + ", " + findFirstName(name);
        }
        return findFirstName(name);
    }
}
