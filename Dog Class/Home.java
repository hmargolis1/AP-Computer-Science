public class Home {
    private String address;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean isScheduled;

    public Home(String address, String ownerName, int cleanlinessLevel) {
        this.address = address;
        this.ownerName = CleanUtils.fixName(ownerName);
        this.username = CleanUtils.generateUsername(ownerName);
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.isScheduled = false;

    }

    public Home() {
        this.address = "12345";
        this.ownerName = "Jim Johnson";
        this.username = CleanUtils.generateUsername(ownerName);
        this.cleanlinessLevel = 10;
        this.isScheduled = false;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = CleanUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isSceduled() {
        return isScheduled;
    }

    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public String toString() {
        return "== ABOUT HOME == \nAdress: " + address + "\n" + "Owner: " + ownerName + "\n" + "Username: " + username
                + "Cleanliness Level: " + "\n" + cleanlinessLevel + "Is scheudled for cleaning? " + isScheduled;
    }

    public boolean equals(Home other) {
        return address.equals(other.getAddress()) && ownerName.equals(other.getOwnerName())
                && username.equals(other.getUsername()) && cleanlinessLevel == other.getCleanlinessLevel()
                && isScheduled == other.isSceduled();
    }
}
