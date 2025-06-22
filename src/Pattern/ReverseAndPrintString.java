package Pattern; // Package declaration

public class ReverseAndPrintString { // Class to reverse and print progressive substrings
    public static void main(String[] args) {
        
        // Initialize string
        String s = "Hello";
        
        // Reverse the string using StringBuilder
        s = new StringBuilder(s).reverse().toString(); // s = "olleH"
        
        // Loop from index 0 to length (exclusive of length+1 to avoid StringIndexOutOfBounds)
        for (int i = 0; i <= s.length(); i++) {
            // Print substring from 0 to i
            System.out.println(s.substring(0, i)); // progressively prints characters
        }
    }
}
//✅ Output
//o
//ol
//oll
//olle
//olleH

//Note: The first line is blank because substring(0, 0) is an empty string.
//
//🔑 Key Highlights: How to Solve This Type of Program
//Step	Description
//1️⃣	Reverse the string using StringBuilder or loop
//2️⃣	Loop from 0 to s.length()
//3️⃣	Use s.substring(0, i) to print progressive characters
//4️⃣	Be cautious with bounds to avoid StringIndexOutOfBoundsException

