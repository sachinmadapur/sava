package StringWithSentence;

import java.util.Arrays;
//🧠 Approach:
//Use .split(" ") to break the sentence into an array of words.
//Swap the first and last elements of the array.
//Print the modified array using Arrays.toString() or reconstruct the sentence.

public class Swao_Two_String {
    
    // Main method: Entry point of the Java program
    public static void main(String[] args) {
        
        // Input sentence where the first and last words will be swapped
        String s = "I am Sachin";
        
        // Split the sentence into words
        String[] str = s.split(" ");
        
        // Store the last word temporarily
        String temp = str[str.length - 1];
        
        // Assign the first word to the last position
        str[str.length - 1] = str[0];
        
        // Assign the saved last word to the first position
        str[0] = temp;
        
        // Print the swapped array of words
        System.out.println(Arrays.toString(str));
    }
}
//✅ Final Output: [Sachin, am, I]

