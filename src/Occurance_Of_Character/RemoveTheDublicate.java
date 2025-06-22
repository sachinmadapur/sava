package Occurance_Of_Character;

import java.util.LinkedHashSet;

public class RemoveTheDublicate {
    public static void main(String[] args) {
        String s= "aabbabac";

        // Create a LinkedHashSet to store characters without duplicates
        LinkedHashSet set = new LinkedHashSet();

        // Loop over every character in the string
        for(int i = 0; i < s.length(); i++) {
            // Add the character at index i to the LinkedHashSet
            set.add(s.charAt(i));
        }

        // Print the LinkedHashSet, which contains characters without duplicates
        System.out.println(set);
    }
}
