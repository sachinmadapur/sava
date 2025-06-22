package NumberProgram; // Package declaration

public class Denomination_Of_Currency {
    public static void main(String[] args) {
        int num = 2888; // Amount to be broken down into currency notes
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1}; // Available currency denominations

        // Loop through each denomination
        for (int i = 0; i < notes.length; i++) {
            int deno = num / notes[i];  // Calculate number of notes of current denomination
            System.out.println(notes[i] + "_" + deno);  // Print denomination and count
            num = num % notes[i];       // Update remaining amount after using current denomination
        }
    }
}
//✅ Sample Output
//
//2000_1
//500_1
//200_1
//100_1
//50_1
//20_1
//10_1
//5_1
//2_1
//1_1
//🔑 Key Highlights: How to Break Amount into Currency Denominations
//Start from the highest denomination to minimize the number of notes.
//Use integer division (num / notes[i]) to get count of current denomination notes.
//Update the remaining amount using modulo (num % notes[i]).
//Continue for all denominations until the amount becomes zero.
//Print denomination and count at each step.

