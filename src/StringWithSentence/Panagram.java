package StringWithSentence;

import java.util.HashSet;
//Problem: A pangram is a sentence containing every letter of the English alphabet at least once.
//🧠 Approach:
//Convert the input string to lowercase to ensure case-insensitivity.
//Traverse each character and add only alphabetic characters to a HashSet.
//If the size of the set is 26, then the sentence is a pangram.

public class Panagram {
    
    // Main method: Entry point of the Java program
    public static void main(String[] args) {
        
        // Input sentence to be checked
        String s = "The quick brown fox jumps over the lazy dog";
        
        // Convert the string to lowercase to normalize letter case
        String s1 = s.toLowerCase();
        
        // Create a HashSet to store unique alphabetic characters
        HashSet set = new HashSet();
        
        // Loop through each character in the normalized string
        for (int i = 0; i < s1.length(); i++) {
            
            // Extract the character at current index
            char ch = s1.charAt(i);
            
            // Check if the character is an alphabet (a-z)
            if (Character.isAlphabetic(ch)) {
                
                // Add the character to the set (only unique chars are stored)
                set.add(ch);
            }
        }
        
        // Check if the set contains all 26 letters of the English alphabet
        if (set.size() == 26) {
            // If yes, it's a pangram
            System.out.println(s + " is a panagram");
        } else {
            // Otherwise, it's not a pangram
            System.out.println(s + " is not a panagram");
        }
    }
}
//✅ Final Output: The quick brown fox jumps over the lazy dog is a panagram

