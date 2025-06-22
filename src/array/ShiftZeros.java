package array;

import java.util.Arrays;
//Problem: Move all zeros in an array to the left (or shift non-zero elements to the right), maintaining the order of non-zero elements.
//🧠 Approach:
//Create a new array of the same length initialized with zeros by default.
//Traverse the original array from the end to the start.
//Copy non-zero elements from the original array into the new array starting from the last index going backward.
//This places all zeros on the left and all non-zero elements on the right in the original order.

//Class to shift all zeros in the array to the left side
public class ShiftZeros {
 
 // Main method: entry point of the program
 public static void main(String[] args) {
     
     // Input array with zeros and non-zero elements
     int[] a = {0, 0, 0, 1, 2, 3, 4, 0};
     
     // Create a new array of same length initialized with zeros by default
     int[] b = new int[a.length];
     
     // Start inserting non-zero elements from the end of the new array
     int index = b.length - 1;
     
     // Traverse original array from the last element to the first
     for (int i = a.length - 1; i >= 0; i--) {
         
         // If the current element is not zero,
         // place it at the current index in new array and decrement index
         if (a[i] != 0) {
             b[index--] = a[i];
         }
     }
     
     // Print the new array where zeros are shifted to the left
     System.out.println(Arrays.toString(b));
 }
}
//✅ Final Output: [0, 0, 0, 0, 1, 2, 3, 4]