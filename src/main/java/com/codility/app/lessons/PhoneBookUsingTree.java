package com.codility.app.lessons;

import com.codility.app.models.Contacts;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneBookUsingTree {
    TreeMap<Contacts, Integer> phoneBook;
    private static int index = 0;
    public PhoneBookUsingTree(){
        this.phoneBook = new TreeMap<Contacts, Integer>();
    }

    public TreeMap<Contacts, Integer> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(TreeMap<Contacts, Integer> phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public String toString() {
        return "PhoneBookUsingTree{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    public void insertContacts(String contactName, long phoneNumber){
        this.phoneBook.put(new Contacts(contactName, phoneNumber), index++);
    }

    static class PhoneBookSortUsingName implements Comparator<Contacts>{

        @Override
        public int compare(Contacts x, Contacts y) {
            return x.getContactName().compareTo(y.getContactName());
        }
    }
/*
    public static void main(String[] args) {
        PhoneBookUsingTree phoneBook = new PhoneBookUsingTree();
        phoneBook.insertContacts("alex", 9480566254L);
        phoneBook.insertContacts("xander", 9434566734L);
        phoneBook.insertContacts("greta", 9480536734L);
        phoneBook.insertContacts("adam", 9480566734L);
        System.out.println(phoneBook.getPhoneBook());

        SortedMap<Contacts, Integer> subphoneBook = phoneBook.getPhoneBook().subMap(new Contacts("alex", 9480566254L), new Contacts("xander", 9434566734L));
        System.out.println(subphoneBook);
    }
 */
}

