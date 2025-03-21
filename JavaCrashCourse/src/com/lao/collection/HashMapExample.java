package com.lao.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap instance
        Map<String, Integer> map = new HashMap<String,Integer>();

        // Add key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Retrieve values based on keys
        int aliceAge = map.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Check if a key exists in the map
        boolean isBobPresent = map.containsKey("Bob");
        System.out.println("Is Bob present? " + isBobPresent);

        // Update the value for a key
        map.put("Alice", 26);

        // Remove a key-value pair from the map
        map.remove("Charlie");

        // Iterate over the keys in the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
