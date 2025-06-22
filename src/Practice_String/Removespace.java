package Practice_String;

public class Removespace {
public static void main(String[] args) {
	String s="NO26 Sound";
	String  r="";
	for(int i=0; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(!Character.isWhitespace(ch)) 
		r=r+ch;
	}
	System.out.println(r);
}
}
