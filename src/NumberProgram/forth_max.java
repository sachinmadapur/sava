package NumberProgram;

import java.util.Arrays;

public class forth_max {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,60,70,50,40};
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int max4 = Integer.MIN_VALUE;

		for(int i=0; i<a.length; i++) {
			if(a[i]>max1)
			{max4=max3;
			max3=max2;
			max2=max1;
			max1=a[i];
			}
			else if (a[i]>max2 && a[i]!=max1) {
				max4=max3;
				max3=max2;
				max2=a[i];
			}
			else if (a[i]>max3 && a[i]!=max1 && a[i]!=max2) {
				max4=max3;
				max3=a[i];
			}
			else if (a[i]>max4 && a[i]!=max1 && a[i]!=max2 && a[i]!=max3) {
				max4=a[i];
			}
		}
		System.out.println(max1);		
		System.out.println(max2);
		System.out.println(max3);
		System.out.println(max4);




	}
}