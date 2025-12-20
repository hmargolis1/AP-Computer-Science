public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7 && cat.getMoodLevel() <= 10) {
            return "Currently, " + cat.getName() + " is in a great mood. \nPetting is appreciated.";
        }
        if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <= 7) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life. \nPetting is acceptable.";
        }
        return "Currently, " + cat.getName() + " is plotting revengeance. \nPetting is extremely risky.";
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int x = 0; x < catId.length(); x++) {
            sum += catId.charAt(x);
        }
        return (char) ((sum % 26) + 'A');
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int newLow = high;
            int newHigh = low;
            return (int) (Math.random() * (newHigh - newLow)) + newLow;
        }
        return (int) (Math.random() * (high - low)) + low;
    }

    public static String validateCatId(String catId) {
        if (Integer.valueOf(catId) >= 1000 && Integer.valueOf(catId) <= 9999) {
            return catId;
        }
        return Integer.toString((int) (Math.random() * 9999) + 1000);
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel >= 0 && moodLevel <= 10) {
            return moodLevel;
        }
        if(moodLevel < 0) {
            return 0;
        }
        return 10;
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        if (cat.getMoodLevel() > 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
        if (cat.getMoodLevel() < 2 && cat.isHungry() == true) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        }
        if (cat.getMoodLevel() < 2 && cat.isHungry() == false) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(Cat cat) {
        int guess = (int) (Math.random() * 2) + 1;
        if (guess == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...\nDone!\nCookie appreciated that. ");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up Cookie's bowl...\nDone!\nCookie is eating...\nCookie is full!");
    }
}
