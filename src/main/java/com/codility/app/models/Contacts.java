package com.codility.app.models;

public class Contacts implements Comparable<Contacts> {
    private String contactName;
    private long phoneNumber;

    public Contacts(String contactName, long phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contactName='" + contactName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public int compareTo(Contacts contacts) {
        return this.getContactName().compareTo(contacts.getContactName());
    }
}
