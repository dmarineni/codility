package com.codility.app.lessons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    Map<String, Long> contacts;
    {
        contacts = new HashMap<>();
        contacts.put("edward", 9480766745L);
        contacts.put("edwin", 9580766745L);
        contacts.put("greta", 9480766755L);
    }
    private List<String> getMatchingContactNames(ArrayList<String> contactNames, String searchString){
//        List<String> matchingContactNames = new ArrayList<>();
        return contactNames.stream().filter(x -> x.startsWith(searchString)).collect(Collectors.toList());
    }
    public void getContactDetails(String searchString){
        System.out.println("Search string : " + searchString);
//        this.getMatchingContactNames(new ArrayList<>(this.contacts.keySet()), searchString).forEach(x -> System.out.println(x +" : " + contacts.get(x.startsWith(searchString))));
        new ArrayList<>(this.contacts.keySet()).stream().filter(x -> x.startsWith(searchString)).forEach(x -> System.out.println(x +" : " + contacts.get(x)));
    }

//    public static void main(String[] args) {
//        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.getContactDetails("e");
//        phoneBook.getContactDetails("ed");
//        phoneBook.getContactDetails("edwi");
//        phoneBook.getContactDetails("f");
//    }
}
