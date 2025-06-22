package NumberProgram; // Package declaration

public class SwapNumber {
    public static void main(String[] args) {
        
        int a = 10; // Initialize first number
        int b = 20; // Initialize second number
        
        System.out.println("Before Swap"); // Print before swapping
        System.out.println("a:" + a);      // Print initial value of a
        System.out.println("b:" + b);      // Print initial value of b
        
        a = a + b;  // Step 1: Sum both numbers and store in a (a=30)
        b = a - b;  // Step 2: Subtract b from new a to get original a (b=10)
        a = a - b;  // Step 3: Subtract new b from new a to get original b (a=20)
        
        System.out.println("After Swap");  // Print after swapping
        System.out.println("a:" + a);      // Print swapped value of a
        System.out.println("b:" + b);      // Print swapped value of b
    }
}
//✅ Sample Output
//Before Swap
//a:10
//b:20
//After Swap
//a:20
//b:10

//🔑 Key Highlights: How to Swap Two Numbers Without Temporary Variable
//Add both numbers and store in one variable: a = a + b
//Get original value of a by subtracting b from new a: b = a - b
//Get original value of b by subtracting new b from new a: a = a - b
//This way, values are swapped without using any extra variable.

