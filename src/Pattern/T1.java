package Pattern;

public class T1 { // Class to print a simple left-aligned triangle pattern
    public static void main(String[] args) {

        // Define number of rows for the pattern
        int rows = 3;

        // Outer loop controls the number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop controls the number of columns (fixed to total rows)
            for (int j = 1; j <= rows; j++) {

                // Condition to decide whether to print '*' or ' '
                if (i >= j) {
                    System.out.print("*"); // Print star if row >= column
                } else {
                    System.out.print(" "); // Otherwise print space
                }
            }

            // Move to next line after inner loop finishes
            System.out.println();
        }
    }
}
//✅ Output: 
//*  
//** 
//***

//🧠 Key Highlights: How to Solve Pattern Printing Problems
//Step	Description
//✅ Understand Output	Observe the shape and how the rows and columns interact.
//✅ Use Nested Loops	Outer loop = rows, inner loop = columns.
//✅ Conditional Logic	Use if-else inside inner loop to decide what to print.
//✅ Use System.out.print() for same-line printing and System.out.println() for new lines.

//Step-by-Step Execution
//Step 1: Initialize rows = 3
//This means the pattern will have 3 lines.
//
//🧭 Outer Loop (controls lines/rows): for (int i = 1; i <= 3; i++)
//We go through i = 1 to 3 (i.e., 3 times = 3 rows)
//
//✅ Iteration 1 (i = 1)
//Inner loop: j = 1 to 3
//j=1: i >= j → 1 >= 1 → true → print *
//j=2: 1 >= 2 → false → print space
//j=3: 1 >= 3 → false → print space
//Output: *
//✅ Iteration 2 (i = 2)
//Inner loop: j = 1 to 3
//j=1: 2 >= 1 → true → print *
//j=2: 2 >= 2 → true → print *
//j=3: 2 >= 3 → false → print space
//Output: **
//✅ Iteration 3 (i = 3)
//Inner loop: j = 1 to 3
//j=1: 3 >= 1 → true → print *
//j=2: 3 >= 2 → true → print *
//j=3: 3 >= 3 → true → print *
//Output: ***


