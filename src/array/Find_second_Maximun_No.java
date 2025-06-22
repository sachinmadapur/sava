package array;
//Problem: Given an array, find the largest and second largest distinct numbers.
//🧠 Approach:
//Initialize max and smax with Integer.MIN_VALUE to handle all integer inputs.
//Iterate over the array:
//If current element is greater than max, update smax to max and max to current element.
//Else if current element is greater than smax but not equal to max, update smax.
//After traversal, max holds the largest number and smax the second largest distinct number.

//Class to find the largest and second largest distinct numbers in an array
public class Find_second_Maximun_No {
 
 // Main method: Entry point of the program
 public static void main(String[] args) {
     
     // Input array with numbers
     int[] a = {200, 50, 60, 200};
     
     // Initialize max and second max to smallest possible integer value
     int max = Integer.MIN_VALUE;
     int smax = Integer.MIN_VALUE;
     
     // Loop through each element in the array
     for (int i = 0; i < a.length; i++) {
         
         // If current element is greater than max,
         // update second max to max and max to current element
         if (a[i] > max) {
             smax = max;
             max = a[i];
         }
         
         // Else if current element is greater than second max
         // and not equal to max, update second max
         else if (a[i] > smax && a[i] != max) {
             smax = a[i];
         }
     }
     
     // Print the maximum number
     System.out.println("Max: " + max);
     
     // Print the second maximum number
     System.out.println("Second Max: " + smax);
 }
}
//✅ Final Output
//Max: 200
//Second Max: 60
