import com.codility.app.lessons.PhoneBookUsingTree2;

import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        PhoneBookUsingTree2 phoneBook = new PhoneBookUsingTree2();
        TreeMap<String, Long> contacts = new TreeMap<>();
        contacts.put("Harry", 9687385610L);
        contacts.put("Aaron", 9567385610L);
        contacts.put("Avry", 9634385610L);
        contacts.put("Garry", 9687885610L);
        contacts.put("Gavin", 9687389610L);
        phoneBook.setContacts(contacts);
        System.out.println(phoneBook.getContacts());
        phoneBook.getContactsStartingWith("A");
        phoneBook.getContactsStartingWith("G");
        phoneBook.getContactsStartingWith("Ga");
        phoneBook.getContactsStartingWith("X");
    }
}
