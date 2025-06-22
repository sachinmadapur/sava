package String;

public class SumOfNumbers {
    public static void main(String[] args) {
        String s = "abc123";  // Input string containing characters and digits
        int sum = 0;          // Initialize sum variable to 0

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // Get the character at index i

            // Check if the character is a digit between '0' and '9'
            if (ch >= '0' && ch <= '9') {
                // Convert char digit to integer value and add to sum
                sum = sum + ch - 48;  // '0' ASCII code is 48, so subtract 48 to get actual digit value
            }
        }

        // Print the final sum of digits found in the string
        System.out.println(sum);
    }
}
