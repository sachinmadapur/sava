package array;

import java.util.Arrays;
//Problem: Given two arrays of possibly different lengths, create a new array where each element is the sum of corresponding elements from the two arrays. If one array is shorter, treat missing elements as zero.
//🧠 Approach:
//Determine the maximum length of the two arrays.
//Create a new array sum of that max length.
//Loop from 0 to max length - 1.
//Add the element from a if within range.
//Add the element from b if within range.
//Print the result.

// Class to perform element-wise sum of two arrays
public class Array_Sum {

    // Main method: entry point of the program
    public static void main(String[] args) {
        
        // First input array
        int[] a = {1, 2, 3, 4};
        
        // Second input array (shorter length)
        int[] b = {2, 3, 4};
        
        // Find the maximum length between the two arrays
        int max = Math.max(a.length, b.length);
        
        // Create a new array to store sum of elements, size = max length
        int[] sum = new int[max];
        
        // Loop through all indices up to max length
        for (int i = 0; i < max; i++) {
            
            // If index i is valid for array a, add a[i] to sum[i]
            if (i < a.length) {
                sum[i] += a[i];
            }
            
            // If index i is valid for array b, add b[i] to sum[i]
            if (i < b.length) {
                sum[i] += b[i];
            }
        }
        
        // Print the resulting sum array
        System.out.println(Arrays.toString(sum));
    }
}
//✅ Final Output: [3, 5, 7, 4]
