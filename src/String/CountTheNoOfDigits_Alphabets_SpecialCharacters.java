package String;  
public class CountTheNoOfDigits_Alphabets_SpecialCharacters {

    public static void main(String[] args) {

        String s = "abc123$%";  // Input string containing alphabets, digits, and special characters

        // Initialize counters for each category
        int alphaCount = 0, digitCount = 0, specialCharCount = 0;

        // Loop through every character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // Get the character at the current index

            // Check if the character is a digit
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }

            // Check if the character is an alphabet (either lowercase or uppercase)
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphaCount++;
            }

            // If not a digit or letter, treat it as a special character
            else {
                specialCharCount++;
            }
        }

        // Display the final counts
        System.out.println("Digits: " + digitCount);
        System.out.println("Alphabets: " + alphaCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
}
