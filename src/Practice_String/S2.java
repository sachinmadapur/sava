package Practice_String;

public class S2{
	public static void main(String[] args) {
		String s="NO26 Sound";
		String d ="", r="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
//			if(Character.isUpperCase(ch)
			if(Character.isDigit(ch)) 
				d=d+ch;
			else
				r=r+ch;

		}
		String sen = d+r;
		System.out.println(sen);
	}
}