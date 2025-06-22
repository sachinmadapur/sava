package String;
//🧠 Approach (Using Stack Logic):
//Use a Stack or a List to simulate stack behavior.
//Traverse each character of the string:
//If the current character closes the last added opening bracket, pop the last item.
//Otherwise, push the character to the stack.
//After traversal, if the stack is empty → it’s balanced. Otherwise → not balanced.


import java.util.ArrayList;

//Main class to check if a string of brackets is balanced
public class BalancedString {
 
 // Main method: Entry point of the program
 public static void main(String[] args) {
     
     // Input string containing brackets to be checked for balance
     String s = "()[]{}";
     
     // Using ArrayList as a stack to track bracket pairing
     ArrayList<Character> list = new ArrayList<>();
     
     // Loop through each character in the string
     for (int i = 0; i < s.length(); i++) {
         
         // Check if list is not empty and current char is a matching closing bracket
         if (list.size() > 0
             && ((s.charAt(i) == ')' && list.get(list.size() - 1) == '(')
              || (s.charAt(i) == ']' && list.get(list.size() - 1) == '[')
              || (s.charAt(i) == '}' && list.get(list.size() - 1) == '{'))) {
             
             // Remove the last opening bracket if it forms a valid pair
             list.remove(list.size() - 1);
         } else {
             // If not a matching pair, add the character to the list
             list.add(s.charAt(i));
         }
     }

     // Check if the list is empty after processing all characters
     if (list.isEmpty()) {
         // If empty, all brackets are balanced
         System.out.println(s + " is a balanced");
     } else {
         // If not, some brackets are unmatched
         System.out.println(s + " is not a balanced");
     }
 }
}
//✅ Final Output: ()[]{} is a balanced












