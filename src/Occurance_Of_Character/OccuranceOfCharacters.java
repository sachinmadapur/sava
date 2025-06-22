// Declare the package name (optional, used for organizing code)
package Occurance_Of_Character;

// Import LinkedHashMap for maintaining insertion order of keys
import java.util.LinkedHashMap;

public class OccuranceOfCharacters {

    // Main method — the entry point of your program
    public static void main(String[] args) {

        // Step 1: Initialize the input string
        String s = "aabbabac";

        // Step 2: Create a LinkedHashMap to store characters and their frequencies
        // LinkedHashMap maintains insertion order (unlike HashMap)
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();

        // Step 3: Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {

            // Extract the character at the current index
            char ch = s.charAt(i);

            // Step 4: If the character is already in the map, increment its count
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } 
            // Step 5: If not present, add the character with a count of 1
            else {
                hash.put(ch, 1);
            }
        }

        // Step 6: Print the character-frequency map
        System.out.println(hash);
    }
}
//✅ Input:
//"aabbabac"
//✅ Expected Output:
//A map showing how many times each character appears, in the order they first appear:
//{a=4, b=3, c=1}