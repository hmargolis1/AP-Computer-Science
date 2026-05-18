public class CleanUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
            return 0;
        }
        if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
            return 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static String generateUsername(String name) {
        int index = name.indexOf(" ");
        String firstName = name.substring(0, index);
        String lastName = name.substring(index);
        return "@" + firstName + "_" + lastName + "_" + (((int) Math.random() * 1950) + 1950);
    }

    public static int cleanHome(Home home) {
        int added = home.getCleanlinessLevel() + 2;
        home.setCleanlinessLevel(added);
        return added;
    }

    public static String fixName(String name) {
        String result = "";
        int startOfFirstname = 0;
        int startOfLast = 0;
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) != ' ') {
                startOfFirstname = i;
                break;
            }
        }
        int indexMiddleSpace = (name.substring(startOfFirstname)).indexOf(" ");
        result = name.substring(startOfFirstname, indexMiddleSpace);

        for (int j = indexMiddleSpace; j < name.length() - 1; j++) {
            if (name.charAt(j) != ' ') {
                startOfLast = j;
                break;
            }
        }
        for (int k = startOfLast; k < name.length() - 1; k++) {
            if (name.charAt(k) != ' ') {
                result += name.charAt(k);
            }
        }
        return result;
    }
}
