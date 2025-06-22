package Substring; // Package declaration

public class AllPossibleSubStringForPallindrome {
    public static void main(String[] args) {
        
        String s = "sum"; // Input string
        
        // Outer loop to fix the start index of substring
        for (int i = 0; i < s.length(); i++) {
            
            // Inner loop to fix the end index (+1 since substring end is exclusive)
            for (int j = i + 1; j <= s.length(); j++) {
                
                // Print substring from index i (inclusive) to j (exclusive)
                System.out.print(s.substring(i, j) + " ");
            }
        }
    }
}
//✅ Output: s su sum u um m 

//🔑 Key Highlights: How to generate all substrings
//Step	Description
//1️⃣	Use two nested loops — outer for start index, inner for end index
//2️⃣	Extract substring using s.substring(start, end) where end is exclusive
//3️⃣	Print or store the substring as needed

