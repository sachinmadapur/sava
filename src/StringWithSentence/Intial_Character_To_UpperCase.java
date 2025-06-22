package StringWithSentence;
//🧠 Approach:
//Split the sentence into words using .split(" ").
//For each word:
//Convert the first character to uppercase.
//Append the rest of the word using substring(1).
//Print or build the final string.

public class Intial_Character_To_UpperCase {
    
    // Main method: Entry point of the Java program
    public static void main(String[] args) {
        
        // Input string to be processed
        String s = "India is a Champian";
        
        // Split the sentence into individual words
        String[] str = s.split(" ");
        
        // Loop through each word in the array
        for (int i = 0; i < str.length; i++) {
            
            // Store the current word
            String s1 = str[i];
            
            // Convert the first letter to uppercase and append the rest of the word
            System.out.print(Character.toUpperCase(s1.charAt(0)) + s1.substring(1) + " ");
        }
    }
}

// Final Output: India Is A Champian 

