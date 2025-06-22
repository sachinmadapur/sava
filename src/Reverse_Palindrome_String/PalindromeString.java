// Declare the package this class belongs to.
// Packages help organize your Java files logically.
package Reverse_Palindrome_String;

// Define the class named PalindromeString.
// In Java, every application must contain a class.
public class PalindromeString {

    // This is the main method — the starting point of the program.
    public static void main(String[] args) {

        // Step 1: Declare and initialize a string variable with the value "Dad"
        // This is the input we want to check for palindrome property.
        String s = "Dad";

        // Step 2: Initialize an empty string to store the reversed version of 's'
        String rev = "";

        // Step 3: Use a for-loop to reverse the string.
        // Start from the last character (s.length() - 1) and go backwards (i--)
        for (int i = s.length() - 1; i >= 0; i--) {

            // Extract the character at position 'i'
            char ch = s.charAt(i);

            // Append the character to the reversed string 'rev'
            rev = rev + ch;
        }

        // Step 4: Check if the original string and the reversed string are equal
        // Use equalsIgnoreCase() to ignore case differences (e.g., "Dad" vs "daD")
        if (s.equalsIgnoreCase(rev)) {

            // If they match, print that it's a palindrome
            System.out.println(s + " is a Palindrome");

        } else {

            // If they don't match, print that it's not a palindrome
            System.out.println(s + " is not a Palindrome");
        }
    }
}
