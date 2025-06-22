package Occurance_Of_Character;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicateCharacters {

    public static void main(String[] args) {

        // Input string
        String s = "aabbabac";

        // LinkedHashMap to store character counts while preserving order
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();

        // Count the occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else {
                hash.put(ch, 1);
            }
        }

        // Moved the printing loop outside the counting loop to fix logic
        for (Entry<Character, Integer> map : hash.entrySet()) {
            if (map.getValue() > 1) {
                System.out.print(map.getKey());
            }
        }
    }
}
