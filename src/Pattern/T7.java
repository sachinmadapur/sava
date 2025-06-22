package Pattern;

public class T7 {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
