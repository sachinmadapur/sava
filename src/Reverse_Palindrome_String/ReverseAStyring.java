// Declare the package the class belongs to.
// This is optional unless you’re organizing code in a package.
package Reverse_Palindrome_String;

// Define the class named ReverseAStyring (typo — better as ReverseAString)
public class ReverseAStyring {

    // Main method: the entry point of any Java program
    public static void main(String[] args) {

        // Step 1: Declare and initialize the original string to reverse
        String s = "Apple";

        // Step 2: Create an empty string to store the reversed result
        // NOTE: It currently starts with a space (" "), which adds an extra space at the start.
        // It’s better to use "" instead of " "
        String rev = "";

        // Step 3: Loop from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {

            // Extract each character from the end of the original string
            char ch = s.charAt(i);

            // Append it to the reversed string
            rev = rev + ch;
        }

        // Step 4: Print the reversed string to the console
        System.out.println(rev);
    }
}
