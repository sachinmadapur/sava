package Pattern;

public class PyramidPattern2 {
    public static void main(String[] args) {
        int n = 5; // Height of the pyramid
        int a = 1; // Counter for numbers

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   "); // 3 spaces to align with numbers
            }

            // Print numbers in pyramid form
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(a++ + "  "); // print number followed by 2 spaces
            }

            // Move to next line
            System.out.println();
        }
    }
}
