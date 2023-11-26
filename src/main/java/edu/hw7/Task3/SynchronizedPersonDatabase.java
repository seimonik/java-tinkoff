package edu.hw7.Task3;

import org.jetbrains.annotations.Nullable;
import java.util.List;

public class SynchronizedPersonDatabase extends SimplePersonDatabase {
    public synchronized void add(Person person) {
        super.add(person);
    }

    public synchronized void delete(int id) {
        super.delete(id);
    }

    public synchronized @Nullable List<Person> findByName(String name) {
        return super.findByName(name);
    }

    public synchronized @Nullable List<Person> findByAddress(String address) {
        return super.findByAddress(address);
    }

    public synchronized @Nullable List<Person> findByPhone(String phone) {
        return super.findByPhone(phone);
    }
}
