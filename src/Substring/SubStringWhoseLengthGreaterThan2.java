package Substring; // Package declaration

public class SubStringWhoseLengthGreaterThan2 {
    // Find the longest palindrome substring with length > 2
    public static void main(String[] args) {
        
        String s = "aabbabac"; // Input string
        
        int length = 0;        // To store length of longest palindrome found
        String s3 = "";        // To store longest palindrome substring
        
        // Outer loop picks starting index of substring
        for (int i = 0; i < s.length(); i++) {
            
            // Inner loop picks ending index (+1 because substring end is exclusive)
            for (int j = i + 1; j <= s.length(); j++) {
                
                String s1 = s.substring(i, j); // Extract substring
                
                String s2 = new StringBuilder(s1).reverse().toString(); // Reverse substring
                
                // Check if substring is palindrome, length > 2 and longer than previous longest
                if (s1.equals(s2) && s1.length() > 2 && length < s1.length()) {
                    length = s1.length(); // Update max length
                    s3 = s1;              // Update longest palindrome substring
                }
            }
        }
        
        System.out.println(s3); // Print longest palindrome substring with length > 2
    }
}
//✅ Sample Output: abba
//
//🔑 Key Highlights: How to Solve This Type of Palindrome Substring Problem
//Step	Description
//1️⃣	Use nested loops to consider all possible substrings
//2️⃣	Extract substring with s.substring(i, j) where j is exclusive
//3️⃣	Check if substring is palindrome by comparing with its reverse
//4️⃣	Keep track of longest palindrome substring found (with length > 2)
//5️⃣	Print the longest palindrome substring after loop ends
//

