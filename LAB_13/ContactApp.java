public class ContactApp {
    // custom map to store contacts
    private Entry[] contacts;
    // counter to keep track of number of contacts
    private int size;

    // custom entry class to store key-value pairs
    private static class Entry {
        String key;
        Object value;
        Entry next;

        Entry(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public ContactApp(int capacity) {
        // initialize the custom map with the specified capacity
        contacts = new Entry[capacity];
    }

    // method to display all contacts
    public void displayAllContacts() {
        for (int i = 0; i < contacts.length; i++) {
            Entry entry = contacts[i];
            while (entry != null) {
                System.out.println(entry.key + " -> " + entry.value);
                entry = entry.next;
            }
        }
    }

    // method to search for a contact by name and print its number
    public void searchContact(String name) {
        int index = getIndex(name);
        Entry entry = contacts[index];
        while (entry != null) {
            if (entry.key.equals(name)) {
                System.out.println(name + " -> " + entry.value);
                return;
            }
            entry = entry.next;
        }
        System.out.println(name + " not found.");
    }

    // method to add a new contact at a specific position
    public void addContact(String name, Object number, int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position. Contact not added.");
        } else {
            // create a new entry for the contact
            Entry newEntry = new Entry(name, number);
            // get the index in the custom map
            int index = getIndex(name);
            // insert the new entry at the specified position
            if (pos == 0) {
                newEntry.next = contacts[index];
                contacts[index] = newEntry;
            } else {
                Entry prev = getEntryAtPosition(index, pos - 1);
                newEntry.next = prev.next;
                prev.next = newEntry;
            }
            size++;
            System.out.println("Contact added successfully.");
        }
    }

    // method to update a contact's name and/or number
    public void updateContact(String name1, String name2, Object number) {
        int index = getIndex(name1);
        Entry entry = contacts[index];
        while (entry != null) {
            if (entry.key.equals(name1)) {
                // update the contact's name and/or number
                entry.key = name2;
                entry.value = number;
                System.out.println("Contact updated successfully.");
                return;
            }
            entry = entry.next;
        }
        System.out.println(name1 + " not found.");
    }

    // method to delete a contact by name
    public void deleteContact(String name) {
        int index = getIndex(name);
        Entry entry = contacts[index];
        Entry prev = null;
        while (entry != null) {
            if (entry.key.equals(name)) {
                // remove the entry from the custom map
                if (prev == null) {
                    contacts[index] = entry.next;
                } else {
                    prev.next = entry.next;
                }
                size--;
                System.out.println("Contact deleted successfully.");
                return;
            }
            prev = entry;
            entry = entry.next;
        }
        System.out.println(name + " not found.");
    }

    // helper method to get the index in the custom
// map for a given key
    private int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = hashCode % contacts.length;
        return index < 0 ? index + contacts.length : index;
    }
    // helper method to get the entry at a specific position in the custom map
    private Entry getEntryAtPosition(int index, int pos) {
        Entry entry = contacts[index];
        for (int i = 0; i < pos; i++) {
            entry = entry.next;
        }
         return entry;
    }
public static void main(String[] args) {
    // create a new ContactApp with a capacity of 10
    ContactApp contactApp = new ContactApp(10);

    // add some contacts
    contactApp.addContact("Alice", "123-456-7890", 0);
    contactApp.addContact("Bob", "456-789-0123", 1);
    contactApp.addContact("Charlie", "789-012-3456", 2);

    // display all contacts
    contactApp.displayAllContacts();

    // search for a contact by name
    contactApp.searchContact("Alice");

    // add a new contact at a specific position
    contactApp.addContact("David", "012-345-6789", 1);

    // update a contact's name and number
    contactApp.updateContact("Bob", "Bobby", "111-222-3333");

    // delete a contact
    contactApp.deleteContact("Charlie");

    // display all contacts again
    contactApp.displayAllContacts();
}
}
