package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordSubSets_916 {
	
	public static void main(String[] args) {
		String words1[] = {"amazon","apple","facebook",
				"google","leetcode"}; 
		String 	words2[] = {"lo","eo"};
		List<String> res=	getResult(words1,words2);
		System.out.println(res);
	}

	private static List<String> getResult(String[] words1, String[] words2) {
		List<String> result=new ArrayList<String>();
		List<Map<Character,Integer>> listmap=new ArrayList<Map<Character,Integer>>();
		Map<Character,Integer> map = null;
		for(String s:words2) {
			map=new TreeMap<Character,Integer>();
			for(Character c:s.toCharArray()) {
				if(map.containsKey(c)) {
					map.put(c,map.get(c)+1);
				}else {
					map.put(c, 1);
				}
			}
			listmap.add(map);
		}
		for(String s:words1) {
			List<Map<Character,Integer>> maps=new ArrayList<Map<Character,Integer>>();
			for(Map<Character,Integer> m:listmap) {
				Map<Character, Integer> tmp = null;
				for (Map.Entry<Character, Integer> entry : m.entrySet()) {
					tmp=new TreeMap<Character,Integer>();
					tmp.put(entry.getKey(), entry.getValue());
				}
				maps.add(tmp);
			}
			
			
			char[] arr=s.toCharArray();
			Arrays.sort(arr);
			for(Character c:arr) {
				for(Map<Character,Integer> tmp:maps) {
					if(tmp.containsKey(c)) {
						   tmp.put(c, tmp.get(c)-1);
						   if(tmp.get(c)==(int)0) {
							   tmp.remove(c);
						   }
						   if(tmp.isEmpty()) {
							   if(!result.contains(s)) {
								   result.add(s);
							   }
							}
					   }
				}
			   
			}
		}
		return result;
	}

}
