package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonReapetingCharacter {
	
	public static void main(String[] args) {
		//String s="abcabcabc";
		String s="aanabcccdeeef";
		System.out.println(getCharacter(s));
	}

	private static char getCharacter(String s) {
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		
		Set<Character> set=map.keySet();
		for(Character c:set) {
			if(map.get(c)==1) {
				return c;
			}
		}
		return 0;
		
		
		
		
	}

}
