package String;
// ⚠️ Avoid naming the package 'String' as it conflicts with Java's built-in `String` class.

public class SwapStrings {

    public static void main(String[] args) {

        // Declare and initialize two strings
        String s1 = "Apple";
        String s2 = "Mango";

        // Print before swap
        System.out.println("Before Swap");
        System.out.println("S1 : " + s1);
        System.out.println("S2 : " + s2);

        // Step 1: Append s2 to s1
        s1 = s1 + s2; // s1 = "AppleMango"

        // Step 2: Extract original s1 and assign it to s2
        // Length of original s1 = 5 → s1.substring(0, 5) = "Apple"
        s2 = s1.substring(0, s1.length() - s2.length());

        // Step 3: Extract original s2 and assign it to s1
        // Now s2 = "Apple", so s1.substring(5) = "Mango"
        s1 = s1.substring(s2.length());

        // Print after swap
        System.out.println("After Swap");
        System.out.println("S1 : " + s1); // Mango
        System.out.println("S2 : " + s2); // Apple
    }
}
