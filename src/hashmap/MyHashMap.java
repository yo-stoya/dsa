package hashmap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    private int size = 7;
    private Entry[] entries;

    public MyHashMap() {
        entries = new Entry[size];

    }

    public void set(String key, int value) {
        int index = hash(key);
        Entry entry = new Entry(key, value);
        if (entries[index] == null) {
            entries[index] = entry;
        } else {
            Entry temp = entries[index];
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = entry;

        }
    }

    public int get(String key) {
        int index = hash(key);
        Entry entry = entries[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }

        return -1;
    }

    public List<String> keys() {
        List<String> keys = new ArrayList<>();
        for (Entry entry : entries) {
            Entry temp = entry;
            while (temp != null) {
                keys.add(temp.key);
                temp = temp.next;
            }
        }
        return keys;
    }

    public void printTable() {
        for (int i = 0; i < entries.length; i++) {
            System.out.println(i + ":");
            Entry temp = entries[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        for (char keyChar : key.toCharArray()) {
            int asciiValue = keyChar;
            hash = (hash + asciiValue * 23) % entries.length;
        }
        return hash;
    }

    private static class Entry {
        String key;
        int value;
        Entry next;


        public Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
