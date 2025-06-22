package Occurance_Of_Character;

import java.util.LinkedHashMap;

public class AsgnPrintOnlyUnique {

    public static void main(String[] args) {

        String s = "1231234";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.print(ch);  // you could break here if only 1st unique needed
            }
        }
    }
}
//✅ INPUT: "1231234"
//✅ 1st Output: 1-2, 2-2, 3-2, 4-1
//✅ 2nd Output: 1234 (unique characters only once, preserving order)
//✅ 3rd Output: 4 (character with only 1 occurrence — unique)