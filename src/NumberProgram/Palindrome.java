package NumberProgram; // Package declaration

public class Palindrome {
    public static void main(String[] args) {
        
        int num = 1221;      // Number to check for palindrome
        int rev = 0;         // Variable to store reversed number
        int temp = num;      // Store original number in temp for comparison
        
        // Loop to reverse the number
        while (num > 0) {
            int d = num % 10;      // Get last digit of num
            rev = rev * 10 + d;    // Append digit to rev (build reversed number)
            num = num / 10;        // Remove last digit from num
        }
        
        // Check if original number and reversed number are same
        if (rev == temp) {
            System.out.println(temp + " is a palindrome");  // It's a palindrome
        } else {
            System.out.println(temp + " is not a palindrome"); // Not a palindrome
        }
    }
}
//✅ Sample Output: 1221 is a palindrome

//🔑 Key Highlights: How to Check Palindrome Number
//Extract digits from the number one by one using % 10.
//Build the reversed number by multiplying the current reversed number by 10 and adding the extracted digit.
//Compare the reversed number with the original number.
//If equal, the number is a palindrome.

