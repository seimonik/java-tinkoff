package edu.hw6.Task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DiskMap implements Map<String, String> {
    private String filePath;
    private Map<String, String> data;

    public DiskMap(String filePath) {
        this.filePath = filePath;
        this.data = new HashMap<>();
        loadFromDisk();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return data.containsValue(value);
    }

    @Override
    public String get(Object key) {
        return data.get(key);
    }

    @Override
    public String put(String key, String value) {
        String previousValue = data.put(key, value);
        saveToDisk();
        return previousValue;
    }

    @Override
    public String remove(Object key) {
        String removedValue = data.remove(key);
        saveToDisk();
        return removedValue;
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> m) {
        data.putAll(m);
        saveToDisk();
    }

    @Override
    public void clear() {
        data.clear();
        saveToDisk();
    }

    @Override
    public java.util.Set<String> keySet() {
        return data.keySet();
    }

    @Override
    public java.util.Collection<String> values() {
        return data.values();
    }

    @Override
    public java.util.Set<Entry<String, String>> entrySet() {
        return data.entrySet();
    }

    private void saveToDisk() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Entry<String, String> entry : data.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromDisk() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    data.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
        }
    }
}
