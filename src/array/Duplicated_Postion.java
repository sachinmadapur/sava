package array;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

//Problem: Given an array, print each element along with the positions where it occurs more than once.
//🧠 Approach:
//Use a LinkedHashMap<Integer, ArrayList> to maintain insertion order and track indices.
//Traverse the array:
//If an element already exists in the map, append the current index to its list.
//If not, create a new entry with a new ArrayList.
//Finally, print elements whose index lists are non-empty, i.e., duplicates.

//Class to find duplicate values and their positions in an array
public class Duplicated_Postion {
	
 // Main method: entry point of the program
	public static void main(String[] args) {
		
		// Input array
		int[] a = {1, 2, 3, 1, 2, 3, 3, 4};
		
		// LinkedHashMap to maintain the order of insertion and map elements to index positions
		LinkedHashMap<Integer, ArrayList> hash = new LinkedHashMap<>();
		
		// Traverse the array and store indices of repeated elements
		for (int i = 0; i < a.length; i++) {
			
			// If element already present, add current index to its list
			if (hash.containsKey(a[i])) {
				hash.get(a[i]).add(i);
			}
			// If element seen for first time, put it with a new list
			else {
				hash.put(a[i], new ArrayList());
			}
		}
		
		// Traverse the map to print keys with their positions (if duplicate)
		for (Entry<Integer, ArrayList> map : hash.entrySet()) {
			if (map.getValue().size() > 0)  // Only if duplicates found
				System.out.println(map.getKey() + "_" + map.getValue());
		}
	}
}
//✅ Final Output
//1_[3]
//2_[4]
//3_[5, 6]