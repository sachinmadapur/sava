package NumberProgram; // Package declaration

public class PowerNumber {
    public static void main(String[] args) {
        
        int num = 5;      // Base number to be raised to power
        int power = 3;    // Exponent value
        int prod = 1;     // Initialize product as 1 (neutral element of multiplication)
        
        // Loop from 1 to power (inclusive) to multiply base 'num' 'power' times
        for (int i = 1; i <= power; i++) {
            prod = prod * num; // Multiply prod by num in each iteration
        }
        
        System.out.println(prod); // Print the final result
    }
}
//✅ Sample Output: 125

//🔑 Key Highlights: How to Calculate Power Using Loop
//Initialize prod as 1 because multiplying by 1 doesn’t change the value.
//Multiply prod by the base number repeatedly power times.
//The final prod after the loop is the base raised to the exponent.

