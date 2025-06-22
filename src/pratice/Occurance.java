package pratice;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class Occurance {
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
		for( Entry<Character, Integer> map : hash.entrySet()) {
			if(map.getValue()==1) {
				System.out.println(map.getKey());
			}
		}
	}
}
