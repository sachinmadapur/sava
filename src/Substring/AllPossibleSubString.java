package Substring; // Package declaration

public class AllPossibleSubString {
    public static void main(String[] args) {
        String s = "sum"; // Input string to generate substrings from
        
        // Outer loop to set the start index of substring
        for(int i = 0; i < s.length(); i++) {
            
            // Inner loop to set the end index (exclusive) of substring
            for(int j = i + 1; j <= s.length(); j++) {
                
                // Print the substring from index i (inclusive) to j (exclusive)
                System.out.print(s.substring(i, j) + " ");
            }
        }
    }
}
//✅ Sample Output: s su sum u um m 

//🔑 Key Highlights: How to Generate All Substrings
//Use two nested loops —
//Outer loop picks the start index i
//Inner loop picks the end index j (always greater than i)
//Extract substring via s.substring(i, j), where j is exclusive
//Print or store each substring as required
//This approach ensures all possible substrings of the string are generated.

