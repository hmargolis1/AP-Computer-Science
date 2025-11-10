public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(" + "\" + name + \" + ): ";
    }

    public static String whoIsAwesome(String name) {
        return name + "is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        return name.indexOf(" ", indexOfFirstSpace(name));
    }

    public static String findFirstName(String name) {
        return name.substring(0, indexOfFirstSpace(name) -1);
    }

    public static String findLastName(String name) {
        for(int x =0; x<name.length(); x--) {
            if(name.charAt(x) == ' ') {
                return name.substring(x);
            }
        }
        return "";
    }

    public static String findMiddleName(String name) {
        
        return "";
    }
}
