package pratice;

import java.util.Arrays;

public class Shift {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		for(int i=1; i<=2; i++)
		{
			int temp = a[0];

			for(int j=0; j<a.length-1; j++) 
			{
				a[j] = a[j+1];
			}
			a[a.length-1] = temp;
		}
		System.out.println(Arrays.toString(a));

	}


}
