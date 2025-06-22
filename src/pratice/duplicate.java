package pratice;

import java.util.HashSet;

public class duplicate {
	public static void main(String[] args) {
		String s ="aabbabac";
		HashSet set = new HashSet();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}
