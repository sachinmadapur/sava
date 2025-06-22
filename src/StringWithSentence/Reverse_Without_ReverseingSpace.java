package StringWithSentence;

public class Reverse_Without_ReverseingSpace {
public static void main(String[] args) {
	String s= "I love India";
	String s1 = s.replace(" ","");
	int index = s1.length()-1;
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)==' ') {
			System.out.print(" ");
		}else {
			System.out.print(s1.charAt(index--));
		}
	}
}
}
 