public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int j = 0; j < registeredMembers.length; j++) {
            if (registeredMembers[j] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        TheaterMember[] newMembers = new TheaterMember[registeredMembers.length * 2];
        for (int j = 0; j < registeredMembers.length; j++) {
            newMembers[j] = registeredMembers[j];
        }
        registeredMembers = newMembers;
        return;
    }

    public void registerMember(TheaterMember member) {
        for (int j = 0; j < registeredMembers.length; j++) {
            if (registeredMembers[j] == null) {
                registeredMembers[j] = member;
                return;
            }
        }
        TheaterMember[] newMember = new TheaterMember[registeredMembers.length + 1];
        for (int j = 0; j < registeredMembers.length; j++) {
            newMember[j] = registeredMembers[j];
        }
        newMember[registeredMembers.length + 1] = member;
        registeredMembers = newMember;
        return;
    }

    public String toString() {
        int count = 0;
        String result = "== " + getTheaterName() + "Members ==\n";

        for (int x = 0; x < registeredMembers.length; x++) {
            count++;
            if (registeredMembers[x] != null) {
                result += count + ".) " + registeredMembers[x].toString() + "\n";
            } else {
                result += count + ".)" + " Null" + "\n";
            }

        }
        return result;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int j = 0; j < registeredMembers.length; j++) {
            if (registeredMembers[j] == member) {
                registeredMembers[j] = null;
                return true;
            }
        }
        return false;
    }
}
