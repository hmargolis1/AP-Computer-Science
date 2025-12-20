public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int j = 0; j < loyaltyCredits.length; j++) {
            if (loyaltyCredits[j] == false) {
                loyaltyCredits[j] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int j = 0; j < loyaltyCredits.length; j++) {
            if (loyaltyCredits[j] == true) {
                count++;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int count = 0;
        for (int j = 0; j < loyaltyCredits.length; j++) {
            if (loyaltyCredits[j] == true) {
                count++;
            }
        }
        if (count >= 6) {
            return "Gold Member";
        }
        if (count >= 3 && count <= 5) {
            return "Silver Member";
        }
        return "Plus Member";
    }

    public String loyaltyHistory() {
        String visits = "";
        for (int j = 0; j < loyaltyCredits.length - 1; j++) {
            if (loyaltyCredits[j] == true) {
                visits += "X, ";
            } else {
                visits += "-, ";
            }
        }
        if (loyaltyCredits[loyaltyCredits.length - 1] == true) {
            visits += "X]";
        } else if (loyaltyCredits[loyaltyCredits.length - 1] == false) {
            visits += "-]";
        }
        return "Loyalty History: [" + visits;
    }

    public String toString() {
        return getName() + " (" + determineMembershipStatus() + "), "
                + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        return getName().equals(other.getName())
                && getLoyaltyCredits().equals(other.getLoyaltyCredits());
    }
}
