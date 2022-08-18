package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IsomorphicStrings_205 {
	
	public static void main(String[] args) {
		String s = "paper", t = "title";
	//	String s = "foo", t = "bar";
		boolean res=getResult(s,t);
		System.out.println(res);
		/*
		 * p-t t-p b-f f-b a-i i-a a-o o-a p-t t-p r-o o-r e-l l-e r-e e-r
		 */
	}

	private static boolean getResult(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		Map<Character,Character> map1=new HashMap<Character, Character>();
		Map<Character,Character>   map2=new HashMap<Character, Character>();
		for(int i=0;i<s.length();i++) {
			if(map2.containsKey(t.charAt(i))){
				if(map2.get(t.charAt(i))!=s.charAt(i)) {
					return false;
				}
			}
			if(map1.containsKey(s.charAt(i))) {
				if(map1.get(s.charAt(i))!=t.charAt(i)) {
					return false;
				}
			}else {
				map1.put(s.charAt(i), t.charAt(i));
				map2.put(t.charAt(i),s.charAt(i));
			}
		}
        
		return true;
	}

}
