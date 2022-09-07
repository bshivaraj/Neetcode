package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReaptingCharcter {
	
	public static void main(String[] args) {
		String s="aabccde";
		char c=getResult(s);
		System.out.println(c);
	}

	private static char getResult(String s) {
		if(s==null || s.isEmpty()) {
			return '_';
		}
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i),1);
			}
		}
		
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i))==1) {
					return s.charAt(i);
				}
			}
		}
		return '_';
	}

}
