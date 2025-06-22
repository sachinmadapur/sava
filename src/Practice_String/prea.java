package Practice_String;

import java.util.Arrays;
import java.util.HashSet;

public class prea {
	public static void main(String[] args) {
	     int[] a = {200, 50, 60, 70, 200};
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
				}
			else if (a[i]<smax && a[i]!=max) {
				smax=a[i];
			}
		}
		System.out.println(max+" Max");
		System.out.println(smax+" Min");

	}
}
