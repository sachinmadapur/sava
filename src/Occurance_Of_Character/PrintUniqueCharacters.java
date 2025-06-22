package Occurance_Of_Character;

import java.util.LinkedHashMap;

public class PrintUniqueCharacters {

    public static void main(String[] args) {

        // Step 1: Input string
        String s = "aabbabac";

        // Step 2: LinkedHashMap to maintain character counts in insertion order
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();

        // Step 3: Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else {
                hash.put(ch, 1);
            }
        }

        // Step 4: Print only characters with count = 1 (i.e., unique characters)
        System.out.println("Unique characters:");
        for (Character key : hash.keySet()) {
            if (hash.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}
//From input "aabbabac"
//→ Expected Output:c (Because only 'c' occurs exactly once.)
