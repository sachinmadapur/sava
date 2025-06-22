package NumberProgram; // Package declaration

public class NumberDivisiblity {
    public static void main(String[] args) {
        
        int num = 45; // Number to check divisibility
        
        // Check if number is divisible by both 3 and 5
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("hey_Bye");  // Divisible by both 3 and 5
        }
        // Check if number is divisible only by 3
        else if (num % 3 == 0) {
            System.out.println("Hey");  // Divisible by 3 only
        }
        // Check if number is divisible only by 5
        else if (num % 5 == 0) {
            System.out.println("Bye");  // Divisible by 5 only
        }
    }
}
//✅ Sample Output: hey_Bye
//🔑 Key Highlights: How to Check Divisibility
//Use the modulo operator % to find the remainder when dividing.
//If num % x == 0, it means num is divisible by x.
//Check for combined divisibility (num % 3 == 0 && num % 5 == 0) first to handle multiples of both.
//Then check for individual divisibility cases
//Print the corresponding message based on conditions.



