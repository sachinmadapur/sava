package pratice;

public class UpperCase {
	public static void main(String[] args) {
		String s = "i am student";
		String[] str = s.split(" ");
		for(int i=0; i<str.length; i++) {
			String s1 = str[i];
			System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");

		}
	}
}
