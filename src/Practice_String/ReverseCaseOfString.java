package Practice_String;

public class ReverseCaseOfString {
	public static void main(String[] args) {
		String s="NO26 Sound";
		String  r="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				r=r+Character.toLowerCase(ch);
			else
				r=r+Character.toUpperCase(ch);
		}
		System.out.println(r);
	}
}