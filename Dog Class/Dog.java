public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar(this.dogId);
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Timmy";
        this.ownerName = "Jebadiah";
        this.age = 70;
        this.dogId = 132;
        this.dogChar = generateDogChar(this.dogId);
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public static char generateDogChar(int dogId) {
        int hundreds = dogId/100;
        int tens = (dogId % 100) / 10;
        int ones = (dogId % 10);
        return (char) ('F' + (hundreds + tens + ones) % 10);
    }

    public String generateDogTag() {
        return "" + dogId + dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        if(personName == dog.ownerName) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner " + dog.ownerName + ".";
        }
        else return dog.name + " cannot leave because " + personName + " is not their owner, saftey first!";
    }

    public static void checkIn(Dog dog, String personName) {
        dog.ownerName = personName;
        dog.stillInFacility = true;
    }

    public String toString() {
        if(isStillInFacility() == false) {
            return name + " is a good dog. They are " + age + " years old and belong to " 
            + ownerName 
            + ". They are currently not in our facility. For employee use only: DogTag is " 
            + dogTag;
    } else {
         return name + " is a good dog. They are " + age + " years old and belong to " 
        + ownerName
        + ". They are currently in our facility. For employee use only: DogTag is " 
        + dogTag;
    }
    }

    public boolean equals(Dog other) {
        return this.name.equals(other.name) && 
        this.ownerName.equals(other.ownerName) &&
        this.age == other.age &&
        this.dogTag.equals(other.dogTag);
    }
}
