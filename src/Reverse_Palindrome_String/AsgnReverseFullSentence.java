// Declare the package if you're organizing your classes
package Reverse_Palindrome_String;

// Define the class
public class AsgnReverseFullSentence {
//	✔️ Input:
//		"My name is Sumanth"
//
//		✔️ Output:
//		"htnamuS si eman yM"

    // Main method — entry point of the program
    public static void main(String[] args) {

        // Step 1: Declare and initialize the input string
        String s = "My name is Sumanth";

        // Step 2: Create an empty string to hold the reversed result
        String rev = "";

        // Step 3: Use a for-loop to iterate from end to start of the string
        for (int i = s.length() - 1; i >= 0; i--) {

            // Get each character from the end
            char ch = s.charAt(i);

            // Append it to the reverse string
            rev = rev + ch;
        }

        // Step 4: Print the reversed string
        System.out.println(rev);
    }
}
