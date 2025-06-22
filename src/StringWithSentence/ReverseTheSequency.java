package StringWithSentence;
//🧠 Approach:
//Use split(" ") to divide the sentence into words.
//Iterate through the array in reverse order.
//Print each word followed by a space.
//📌 Example:
//Input: "I am a student"
//Output: "student a am I"

//Class to reverse the order of words in a sentence
public class ReverseTheSequency {
	
 // Main method: Entry point of the Java program
	public static void main(String[] args) {
		
     // Input sentence to reverse word order
		String s = "I am a student";
		
     // Split the sentence by spaces to get an array of words
		String[] str = s.split(" ");
		
     // Loop from last word to first word
		for (int i = str.length - 1; i >= 0; i--) {
			
         // Print each word followed by a space
			System.out.print(str[i] + " ");
		}
	}
}
//✅ Final Output: student a am I 


