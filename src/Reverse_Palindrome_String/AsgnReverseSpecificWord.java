package Reverse_Palindrome_String;

public class AsgnReverseSpecificWord {
//	✅ Input:
//		"I am From Bangalore "
//		(There's an extra space at the end.)
//
//		✅ Expected Output:
//		"I ma morF erolagnaB" → if reversing each word


    public static void main(String[] args) {

        // Input sentence
        String input = "I am From Bangalore";

        // Split into words
        String[] words = input.split(" ");

        // Create a result StringBuilder
        StringBuilder result = new StringBuilder();

        // Loop through each word
        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            // Reverse only the third word (index 2 → "From")
            if (i == 2) {
                String reversed = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reversed = reversed + word.charAt(j);
                }
                result.append(reversed);
            } else {
                result.append(word);
            }

            // Append a space after each word
            result.append(" ");
        }

        // Print the final result after trimming the last space
        System.out.println(result.toString().trim());
    }
}
