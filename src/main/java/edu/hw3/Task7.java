package edu.hw3;

import java.util.Comparator;

public class Task7<T> implements Comparator<T> {
    public Task7() {
    }
    @Override
    public int compare(T o1, T o2) {
        if (o1 == o2) {
            return 0;
        }

        if (o1 == null) {
            return 1;
        }

        if (o2 == null) {
            return -1;
        }

        return ((Comparable<T>) o1).compareTo(o2);
    }
}
