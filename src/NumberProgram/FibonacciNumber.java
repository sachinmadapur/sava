package NumberProgram; // Package declaration

public class FibonacciNumber {
    public static void main(String[] args) {
        int a = 0;      // First Fibonacci number
        int b = 1;      // Second Fibonacci number
        int c;          // To store next Fibonacci number

        System.out.print(a + " " + b + " ");  // Print first two Fibonacci numbers
        
        // Loop to generate next 5 Fibonacci numbers
        for (int i = 1; i <= 5; i++) {
            c = a + b;          // Next Fibonacci number is sum of previous two
            System.out.print(c + " ");  // Print the next number
            a = b;              // Shift 'a' to 'b'
            b = c;              // Shift 'b' to 'c'
        }
    }
}
//✅ Sample Output: 0 1 1 2 3 5 8 
//
//🔑 Key Highlights: How to Generate Fibonacci Numbers
//Initialize the first two numbers (0 and 1).
//Generate the next number by adding the previous two.
//Use a loop to generate the desired count of Fibonacci numbers.
//Update the previous two numbers for the next iteration.
//Print each generated number in sequence.