public class PawesomeUtils {

    public static char generateDogChar(int dogId) {
        int hundreds = dogId/100;
        int tens = (dogId % 100) / 10;
        int ones = (dogId % 10);
        return (char) ('F' + (hundreds + tens + ones) % 10);
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if(dogId >= 100 && dogId <= 999) {
            return dogId;
        } else return (int) (Math.random() * 900) + 100; //between 999 and 100 
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setOwnerName(personName);
        if (dog.getDogId() >= 100 && dog.getDogId() <= 999) {
            dog.setStillInFacility(true);
        } else System.out.println("The dog's ID is invalid.");
    }

    public static boolean validateDogTag(Dog dog) {
        int newDogId = dog.getDogId();
        if (newDogId < 100 || newDogId > 999) {
            return false;
        }
        char newDogChar = PawesomeUtils.generateDogChar(newDogId);
        String newDogTag = PawesomeUtils.generateDogTag(newDogId, newDogChar);
        if (dog.getDogTag().equals(newDogTag)) {
            return true;
        } else
          dog.setDogTag(newDogTag);
        return false;
    }
    
    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        }
        if(dog.getAge() == 2) {
            return 24;
        }
        return 24 + ((dog.getAge() - 2) * dog.getAge()); 
    }

    public static int converateAgetoDogYears(int humanYears) {
        if(humanYears < 15) {
            return 1;
        }
        if(humanYears >=15 && humanYears <= 24) {
            return 2;
        }
        return (int) (1 + Math.ceil(Math.sqrt(-23 + humanYears)));
    }
}
