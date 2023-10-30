package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task7Test {
    @Test
    void test() {
        TreeMap<String, String> treeMap = new TreeMap<>(new Task7());

        treeMap.put(null, "test");

        assertTrue(treeMap.containsKey(null));
    }
}
