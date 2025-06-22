// Declare the package name
package Reverse_Palindrome_String;

// Define the class
public class AsgnReverseEachWord {
//	✅ Input
//	"My name is sumanth"
//
//	✅ Output
//	"yM eman si htnamus" (Note: extra leading space in your input " My..." was ignored here.)
    // Main method — entry point of the program
    public static void main(String[] args) {

        // Step 1: Initialize the input string
        String input = "My name is sumanth";

        // Step 2: Split the string into words using space as delimiter
        String[] words = input.split(" ");

        // Step 3: Create a StringBuilder to store the final output
        StringBuilder result = new StringBuilder();

        // Step 4: Loop through each word
        for (String word : words) {

            // Reverse the current word
            String reversedWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }

            // Append the reversed word and a space
            result.append(reversedWord).append(" ");
        }

        // Step 5: Print the final result (trim to remove trailing space)
        System.out.println(result.toString().trim());
    }
}
