package com.ashuguy.listviewtest;

/**
 * Created by dell on 5/10/2017.
 */

public class Contact {
    String contactName;
    int contactImg;

    public Contact(String contactName, int contactImg) {
        this.contactName = contactName;
        this.contactImg = contactImg;
    }

    public String getContactName() {
        return contactName;
    }

    public int getContactImg() {
        return contactImg;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactName='" + contactName + '\'' +
                ", contactImg=" + contactImg +
                '}';
    }
}
