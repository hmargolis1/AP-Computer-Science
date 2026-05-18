import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {
    private ArrayList<Contact> contactList;

    public ContactList() {
        this.contactList = new ArrayList<Contact>();
    }

    public boolean add(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < contactList.size(); i++) {
            if ((contact.getFirstName().equals(contactList.get(i).getFirstName()))
                    && (contact.getLastName().equals(contactList.get(i).getLastName()))) {
                return false;
            }
            if (contact.getTelephoneNumber().equals(contactList.get(i).getTelephoneNumber())) {
                return false;
            }
        }
        contactList.add(contact);
        return true;
    }

    public boolean remove(Contact contact) {
        return true;
    }
}
