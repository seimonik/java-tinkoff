package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task7Test {
    @Test
    void test() {
        Task7<String> comparator = new Task7<>();

        TreeMap<String, String> treeMap = new TreeMap<>(comparator);

        treeMap.put(null, "test");

        assertTrue(treeMap.containsKey(null));
    }
}
