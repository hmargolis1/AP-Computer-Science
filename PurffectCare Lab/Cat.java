public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "Thomas";
        this.ownerName = "Johnson";
        this.moodLevel = 9;
        this.catId = "8888";
        this.catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;

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

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int newMoodLevel) {
        newMoodLevel = PurrfectUtils.validateMoodLevel(newMoodLevel);
        this.moodLevel = newMoodLevel;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String newCatId) {
        newCatId = PurrfectUtils.validateCatId(newCatId);
        this.catId = newCatId;
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        String catMoodMessage = PurrfectUtils.determineCatMood(this);
        return "== ABOUT " + name.toUpperCase() + " ==\n" + name + " is a cat. "
        + "Their tag is " + generateCatTag() + ".\n" + catMoodMessage;
    }

    public boolean equals(Cat other) {
        return name.equals(other.name) && generateCatTag().equals(other.generateCatTag()) 
        && isHungry == other.isHungry && moodLevel == other.moodLevel 
        && ownerName.equals(other.ownerName);
    }
}