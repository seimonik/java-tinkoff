package edu.hw3.Task5;

import org.jetbrains.annotations.NotNull;

public record Contact(String name, String surname) implements Comparable<Contact>{
    @Override
    public int compareTo(@NotNull Contact o) {
        String thisContact = surname != null ? surname : name;
        return thisContact.compareTo(o.surname != null ? o.surname : o.name);
    }
}
