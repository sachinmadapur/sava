package pratice;

import java.util.Scanner;

public class rought {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String ");
	String s = sc.nextLine();
	String[] s1= s.split(" "); 

	for(int i=s1.length-1; i>=0; i--) {
		char[] ch = s.toCharArray();
		

		System.out.println(ch);
	}
	
	
}
}
