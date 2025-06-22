package Pattern; // Package declaration

public class PyramidPattern { // Class to print a pyramid/star triangle
    public static void main(String[] args) {
        
        // Set the height of the pyramid
        int n = 5; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print space
            }

            // Inner loop for stars in current row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Print star
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
//📌 Output
//
//    *
//   ***
//  *****
// *******
//*********

//🧠 Step-by-Step Execution (For n = 5)
//Each row has:
//
//Spaces: n - i
//
//Stars: 2*i - 1
//
//i (row)	Spaces (n - i)	Stars (2*i - 1)	Output Line
//1	4	1	*
//2	3	3	***
//3	2	5	*****
//4	1	7	*******
//5	0	9	*********
//
//🔑 Key Highlights: How to Do This Type of Pattern Program
//Step	Description
//1️⃣	Count how many rows and columns are needed
//2️⃣	Use outer loop for number of rows
//3️⃣	First inner loop prints leading spaces (n - row)
//4️⃣	Second inner loop prints stars (2 * row - 1)
//5️⃣	Use System.out.println() to go to the next line


