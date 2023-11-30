package edu.hw3;

import edu.hw3.Task8.BackwardIterator;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8Test {
    @Test
    public void test() {
        List<Integer> iterableList = List.of(1, 2, 3);
        BackwardIterator<Integer> iterator = new BackwardIterator<>(iterableList);

        List<Integer> newList = new ArrayList<>();
        while (iterator.hasNext()){
            newList.add((iterator.next()));
        }

        assertEquals(List.of(3, 2, 1), newList);
    }
}
