package array;
//Problem: Given an integer array, find the smallest (min) and largest (max) number.
//🧠 Approach:
//Initialize min and max with the first element.
//Traverse the array using a for loop:
//Update max if the current element is greater.
//Update min if the current element is smaller.
//Print both values.
//Class to find minimum and maximum values in an integer array
public class MinimunAndMaximum {

 // Main method: Entry point of the Java program
 public static void main(String[] args) {

     // Input array to process
     int[] a = {1, 2, 3, 4, 5};

     // Initialize max with the first element of the array
     int max = a[0];

     // Initialize min with the first element of the array
     int min = a[0];

     // Traverse each element in the array
     for (int i = 0; i < a.length; i++) {

         // If current element is greater than current max, update max
         if (a[i] > max) {
             max = a[i];
         }

         // If current element is less than current min, update min
         if (a[i] < min) {
             min = a[i];
         }
     }

     // Print the maximum value found
     System.out.println("max: " + max);

     // Print the minimum value found
     System.out.println("min: " + min);
 }
}
//✅ Final Output: max: 5 , min: 1


