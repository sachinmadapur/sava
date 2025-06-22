package array;

import java.util.LinkedHashSet;

public class Target_Sum { // Class to find pairs that sum to a target
    public static void main(String[] args) {

        // Declare and initialize input array
        int[] a = {1, 2, 3, 5, 6, 7, 8, 1};

        // Define the target sum
        int targetsum = 9;

        // Declare a LinkedHashSet to store unique pairs in insertion order
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Outer loop to pick first number in the pair
        for (int i = 0; i < a.length; i++) {

            // Inner loop to pick second number in the pair
            for (int j = i + 1; j < a.length; j++) {

                // Check if the sum of two numbers is equal to target
                if (a[i] + a[j] == targetsum) {

                    // Format the pair in increasing order to avoid duplicates like (8,1) and (1,8)
                    String sum = a[i] > a[j] ? "(" + a[j] + "," + a[i] + ")" : "(" + a[i] + "," + a[j] + ")";

                    // Add the pair to the set (automatically filters duplicates)
                    set.add(sum);
                }
            }
        }

        // Print the unique pairs that sum to the target
        System.out.println(set);
    }
}
//✅ Output: [(1,8), (2,7), (3,6)]

//🧠 Key Highlights: How to Solve "Target Sum Pairs" Problems
//Step	Description
//✅ Understand	You are given an array and a target sum. Find all unique pairs (i, j) such that arr[i] + arr[j] = target.
//✅ Approach	Use two nested loops to go through all pairs.
//✅ Normalize	Format the pair (smaller, larger) to avoid duplicates in different orders.
//✅ Store	Use a LinkedHashSet or HashSet to avoid repeated pairs.
//✅ Output	Print the final set of unique pairs.
