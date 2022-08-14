package hashing;

import java.util.HashMap;
import java.util.Map;

public class MyHashTable {
	
	public static void main(String[] args) {
		String array[]= {"my","name","is","shiva"};
		Map<String,Integer> map=new HashMap<String, Integer>();
		String arr[]=hashing(array,map);
		System.out.println(arr[map.get("shiva")]);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
	}

	private static String[] hashing(String[] array,Map<String,Integer> map) {
		int res=0;
		String hash[]=new String[array.length];
		for(String s:array) {
			 char c[]=s.toCharArray();
			 for(char c1:c) {
				 res=res+c1;
			 }
			 map.put(s,res%array.length);
			 hash[res%array.length]=s;
			 res=0;
		}
		return hash;
	}

}
