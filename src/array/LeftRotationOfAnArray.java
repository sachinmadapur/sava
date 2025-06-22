package array;

import java.util.Arrays;
//Problem: Rotate an array to the left by d positions.
//🧠 Approach:
//For each rotation (from 1 to d):
//Store the first element temporarily.
//Shift all elements one position to the left.
//Place the temporarily stored element at the end.
//Print the rotated array.
//Class to perform left rotation on an array by a fixed number of positions
public class LeftRotationOfAnArray {
 
 // Main method: entry point of the program
 public static void main(String[] args) {
     
     // Initialize the array to be rotated
     int[] a = {1, 2, 3, 4, 5};
     
     // Number of left rotations to perform (2 in this case)
     for (int i = 1; i <= 2; i++) {
         
         // Store the first element temporarily
         int temp = a[0];
         
         // Shift all elements to the left by one position
         for (int j = 0; j < a.length - 1; j++) {
             a[j] = a[j + 1];
         }
         
         // Place the first element at the end of the array
         a[a.length - 1] = temp;
     }
     
     // Print the rotated array
     System.out.println(Arrays.toString(a));
 }
}
//✅ Final Output: [3, 4, 5, 1, 2]


