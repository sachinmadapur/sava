package String;
// Steps to Solve:
//Iterate through the string in steps of 2: character, then number.
//Convert the character at position i+1 from char to integer using char - '0' (or char - 48).
//Use a nested loop to print the character multiple times according to the number.
public class ExpandTheString {
	
    // Main method: Entry point of the Java program
	public static void main(String[] args) {
		
        // Compressed input string where character is followed by its count
		String s = "a3b2a1c1";
		
        // Loop through the string in steps of 2 (i.e., char + digit)
		for (int i = 0; i < s.length(); i = i + 2) {
			
            // Convert character at i+1 to its numeric value using ASCII (or use Character.getNumericValue)
			int count = s.charAt(i + 1) - 48;
			
            // Get the character to be repeated
			char ch = s.charAt(i);
			
            // Print the character 'count' number of times
			for (int j = 1; j <= count; j++) {
				System.out.print(ch);
			}
		}
	}
}
//✅ Final Output: aaabbaac

