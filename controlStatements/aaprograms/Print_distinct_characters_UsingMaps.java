package aaprograms;

import java.util.HashMap;

public class Print_distinct_characters_UsingMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        String input1 = "interview"; 
		
	    HashMap<Character, Integer> charCountMap1 = new HashMap<>();

	    char[] chars1 = input1.toCharArray();

	    for (char c : chars1) {
	        // Check if the character is already in the map
	    	if (charCountMap1.containsKey(c)) {
	            // If yes, increment its count
	            charCountMap1.put(c, charCountMap1.get(c) + 1);
	        } else
	        {
	            // If no, add the character to the map with a count of 1
	            charCountMap1.put(c, 1);
	        }
	    	if(charCountMap1.containsValue(2))
	    	{
	    		charCountMap1.remove(c);
	    	}
	    }
	    
	    
	    
	    for (HashMap.Entry<Character, Integer> entry : charCountMap1.entrySet()) {
	        System.out.println(entry.getKey());
	    }
	}

}
