package Pattern; // Package declaration

public class T6 { // Class to print right-aligned triangle of numbers
	public static void main(String[] args) {
		int rows = 5; // Total number of rows
		
		// Outer loop for each row
		for(int i = 1; i <= rows; i++) {
			
			int k = 1; // Start number for printing in each row
			
			// Inner loop for each column
			for(int j = 1; j <= rows; j++) {
				
				// Condition to print space or number
				if((i + j) >= (rows + 1)) {
					System.out.print((k++) + " "); // Print number and increment
				} else {
					System.out.print("  "); // Print 2 spaces for alignment
				}
			}
			
			// Move to next line after each row
			System.out.println();
		}
	}
}

//📌 Output
//
//        1 
//      1 2 
//    1 2 3 
//  1 2 3 4 
//1 2 3 4 5 
//| Row (i) | Spaces Printed | Numbers Printed (`k++`) | Full Output Line |
//| ------- | -------------- | ----------------------- | ---------------- |
//| 1       | 4 spaces       | 1                       | `"        1"`    |
//| 2       | 3 spaces       | 1 2                     | `"      1 2"`    |
//| 3       | 2 spaces       | 1 2 3                   | `"    1 2 3"`    |
//| 4       | 1 space        | 1 2 3 4                 | `"  1 2 3 4"`    |
//| 5       | 0 spaces       | 1 2 3 4 5               | `"1 2 3 4 5"`    |

//🪄 Explanation Per Row:
//Spaces printed = rows - i
//Numbers printed = i numbers starting from 1
//Total columns = rows

//🧠 Key Highlights: How to Solve This Type of Pattern
//Step	Description
//1️⃣	Observe pattern alignment — right-aligned requires printing spaces first
//2️⃣	Use condition like (i + j) >= (rows + 1) to control printing numbers
//3️⃣	Use a counter like k to print sequential numbers in each row
//4️⃣	Keep formatting consistent — here, " " helps align the numbers properly

