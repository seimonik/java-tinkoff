package edu.hw7.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplePersonDatabase implements PersonDatabase {
    private final Map<Integer, Person> idPersonMap = new HashMap<>();
    private final Map<String, List<Person>> namePersonMap = new HashMap<>();
    private final Map<String, List<Person>> adressPersonMap = new HashMap<>();
    private final Map<String, List<Person>> phonePersonMap = new HashMap<>();

    @Override
    public void add(Person person) {
        if (idPersonMap.containsKey(person.id())) {
            return;
        }
        addPersonToDatabase(person);
    }

    @Override
    public void delete(int id) {
        Person person = idPersonMap.get(id);
        deletePersonFromDatabase(person);
        idPersonMap.remove(id);
    }

    @Override
    public List<Person> findByName(String name) {
        return namePersonMap.get(name);
    }

    @Override
    public List<Person> findByAddress(String address) {
        return adressPersonMap.get(address);
    }

    @Override
    public List<Person> findByPhone(String phone) {
        return phonePersonMap.get(phone);
    }

    private void addPersonToDatabase(Person person) {
        idPersonMap.put(person.id(), person);

        namePersonMap.computeIfAbsent(person.name(), mapper -> new ArrayList<>());
        namePersonMap.get(person.name()).add(person);

        adressPersonMap.computeIfAbsent(person.address(), mapper -> new ArrayList<>());
        adressPersonMap.get(person.address()).add(person);

        phonePersonMap.computeIfAbsent(person.phoneNumber(), mapper -> new ArrayList<>());
        phonePersonMap.get(person.phoneNumber()).add(person);
    }

    private void deletePersonFromDatabase(Person person) {
        namePersonMap.values().forEach(it -> it.remove(person));

        adressPersonMap.values().forEach(it -> it.remove(person));

        phonePersonMap.remove(person.phoneNumber());
    }

}
