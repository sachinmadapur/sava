// Package declaration; avoid using Java keywords like 'String' as package names.
package String;

// Class to compress a string by counting consecutive occurrences of characters
public class CompressString {

    // Main method where the program starts execution
    public static void main(String[] args) {
        
        // Input string to compress
        String s = "aabbabac";
        
        // Initialize count of character repetitions
        int count = 1;
        
        // Loop through string from first to second last character
        for (int i = 0; i < s.length() - 1; i++) {
            
            // If current char is equal to next char, increment count
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // Print the character and its count
                System.out.print(s.charAt(i) + "" + count);
                
                // Reset count for next character group
                count = 1;
            }
        }
        
        // Print the last character and its count
        System.out.print(s.charAt(s.length() - 1) + "" + count);
    }
}
//✅ Final Output : a2b2a1b1a1c1
//Example: "aabbabac" → a2b2a1b1a1c1

//Steps:
//Use a loop to go through each character.
//Count consecutive repeating characters.
//Print the character followed by its count.
//Edge cases: Handle last character properly and avoid IndexOutOfBoundsException.

