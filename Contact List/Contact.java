public class Contact {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        if (verifyNumber(this.telephoneNumber) != true) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean verifyNumber(String telephoneNumber) {
        if (telephoneNumber.length() != 12) {
            return false;
        }
        if (telephoneNumber.charAt(3) != '-') {
            return false;
        }
        if (telephoneNumber.charAt(7) != '-') {
            return false;
        }
        return true;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int compareTo(Contact other) {
        if (other == null) {
            throw new IllegalArgumentException();
        }
        if (!firstName.equals(other.getFirstName())) {
            return firstName.compareTo(other.getFirstName());
        } else if (!lastName.equals(other.getLastName())) {
            return lastName.compareTo(other.getLastName());
        } else if (!telephoneNumber.equals(other.getTelephoneNumber())) {
            return telephoneNumber.compareTo(other.getTelephoneNumber());
        }
        return 0;
    }

    public String toString() {
        return "Name: " + firstName + ", " + lastName + "\nNumber: " + telephoneNumber;
    }
}