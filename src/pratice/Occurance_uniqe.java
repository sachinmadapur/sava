package pratice;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Occurance_uniqe {
public static void main(String[] args) {
	String s ="aabbabac";
	LinkedHashMap<Character, Integer> hash = new LinkedHashMap();
	for(int i=0; i<s.length(); i++) {
		char ch =s.charAt(i);
		if(hash.containsKey(ch)) {
			hash.put(ch, hash.get(ch)+1);
		}
		else
			hash.put(ch, 1);
	}
	System.out.println(hash);
}
}
