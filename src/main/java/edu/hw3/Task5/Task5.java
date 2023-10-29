package edu.hw3.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static ArrayList<Contact> parseContacts(List<String> contacts, String orderBy) {
        ArrayList<Contact> result = new ArrayList<>();

        for (String contact :
            contacts) {
            Contact newContact;
            String[] fullName = contact.split(" ");
            if (fullName.length == 2) {
                newContact = new Contact(fullName[0], fullName[1]);
            } else {
                newContact = new Contact(fullName[0], null);
            }
            result.add(newContact);
        }

        Collections.sort(result);
        if (orderBy.equals("DESC"))
            Collections.reverse(result);

        return result;
    }
}
