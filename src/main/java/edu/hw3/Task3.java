package edu.hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static <T> Map<T, Integer> freqDict(ArrayList<T> list){
        HashMap<T, Integer> result = new HashMap<>();

        for (T elem : list) {
            result.merge(elem, 1, Integer::sum);
        }

        return result;
    }
}
