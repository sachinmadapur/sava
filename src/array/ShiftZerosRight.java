package array;

import java.util.Arrays;

public class ShiftZerosRight {

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 1, 2, 3, 4, 0};
        int[] b = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[index++] = a[i];
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
