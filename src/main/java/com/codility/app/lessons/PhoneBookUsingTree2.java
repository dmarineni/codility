package com.codility.app.lessons;

import java.util.TreeMap;

public class PhoneBookUsingTree2 {
    private TreeMap<String, Long> contacts;

    public TreeMap<String, Long> getContacts() {
        return contacts;
    }

    public void setContacts(TreeMap<String, Long> contacts) {
        this.contacts = contacts;
    }

    public void getContactsStartingWith(String args){
        System.out.println("Contacts starting with : " + args);
        contacts.keySet().stream().filter(x -> x.startsWith(args)).forEach(x -> System.out.println(x + " : " + contacts.get(x)));
    }

    @Override
    public String toString() {
        return "PhoneBookUsingTree2{" +
                "contacts=" + contacts +
                '}';
    }
    /*
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
     */
}
