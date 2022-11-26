package sky.pro.java.course1.other.PhoneBook;

public class PhoneBook {
    private final Contact[] contacts;
    private int size;

    public PhoneBook(int size) {
        this.contacts = new Contact[15];
    }
    public void addContact (String contact, String phoneNumber) {
        if (size >= contact.length()) {
            System.out.println("Телефонная книга заполнена. В добавлении нового контакта отказано.");
        }
        Contact newContact = new Contact(contact, phoneNumber);
        contacts[size] = newContact;
        size++;
    }
    public void removeContact (String contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getFullName().equals(contact)) {
                contacts[i] = null;
                if (i != contacts.length - 1) {
                    System.arraycopy(contacts, i + 1, contacts, i, size - i);
                }
                size--;
                System.out.println("Контакт " + contact + " удален.");
                return;
            }
        }
        System.out.println("Контакт " + contact + " не найден.");
    }
    public void findContact (String contact) {
        for (int i = 0; i < contacts.length; i++) {
            Contact contact1 = contacts[i];
            if (contact1 != null && contact1.getFullName().equals(contact)) {
                System.out.println(contact1.getFullName() + " : " + contact1.getPhoneNumber());
                return;
            }
        }
        System.out.println("Контакт " + contact + " не найден.");
    }
    public void printAllContacts() {
        for (int i = 0; i < size; i++) {
            Contact contact1 = contacts[i];
            System.out.println(contact1.getFullName() + " : " + contact1.getPhoneNumber());
        }
    }
    public int getCurrentSize() {
        return size;
    }
}
