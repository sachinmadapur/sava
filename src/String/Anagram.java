package String;  

import java.util.Arrays;  
// Importing Arrays utility class to use sort() and equals() methods.

public class Anagram {

    public static void main(String[] args) {

        String s1 = "Read";   // First input string
        String s2 = "Dear";   // Second input string

        // Step 1: Check if the lengths are equal
        if (s1.length() == s2.length()) {

            // Step 2: Convert both strings to lowercase and then to character arrays
            char[] ch1 = s1.toLowerCase().toCharArray();
            char[] ch2 = s2.toLowerCase().toCharArray();

            // Step 3: Sort both character arrays
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // Step 4: Compare sorted arrays
            if (Arrays.equals(ch1, ch2)) {
                System.out.print(s1 + " and " + s2 + " are anagram");
            } else {
                System.out.print(s1 + " and " + s2 + " are not an anagram");
            }

        } else {
            // If lengths don't match, they cannot be anagrams
            System.out.print(s1 + " and " + s2 + " are not anagram");
        }
    }
}
