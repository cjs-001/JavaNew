package aaprograms;

import java.util.HashMap;
import java.util.Map;

public class Print_repeating_characters_UsingMaps {

	public static void main(String[] args) {
		
		
		String input = "interview"; 
		
	    HashMap<Character, Integer> charCountMap = new HashMap<>();

	    char[] chars = input.toCharArray();

	    int count=1;
	    
	    for (char c : chars) {
	        // Check if the character is already in the map
	        if (charCountMap.containsKey(c)) {
	            // If yes, increment its count
	            charCountMap.put(c, charCountMap.get(c) + 1);
	        } else {
	            // If no, add the character to the map with a count of 1
	            charCountMap.put(c, 1);
	        }
	    }
	    
	    for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	        System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
	    
	    
	}
	
	
}
