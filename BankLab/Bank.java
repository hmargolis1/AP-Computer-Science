public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if(isLoanOfficer == true) {
            numberOfLoanOfficers+=numberToHire;
        }
        else numberOfTellers+=numberToHire;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers 
        + " loan officers and " + numberOfTellers + " tellers.";
    }

    public boolean equals(Bank other) {
        return numberOfLoanOfficers == other.numberOfLoanOfficers && numberOfTellers == other.numberOfTellers;
    }

    public double getEmployeeRatio() {
        return (double) numberOfLoanOfficers / numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer == true) {
            if((numberOfLoanOfficers - numberToFire) >=0)
            numberOfLoanOfficers-= numberToFire;
        }
        else if((numberOfTellers - numberToFire) >= 0) {
            numberOfTellers -= numberToFire;
        }
    }
}
