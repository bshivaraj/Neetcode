package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordSubSets_916 {
	
	public static void main(String[] args) {
		String words1[] = {"amazon","apple","facebook",
				"google","leetcode"}; 
		String 	words2[] = {"lo","eo"};
		List<String> res=getResult(words1,words2);
		System.out.println(res);
	}

	private static List<String> getResult(String[] words1, String[] words2) {
		
		int maxword2[]=new int[26];
		List<String> result=new ArrayList<String>();
		for(String s2:words2) {
			int freq[]=getFrequency(s2);
			for(int j=0;j<26;j++) {
				maxword2[j]=Integer.max(maxword2[j], freq[j]);
			}
		}
		for(String s1:words1) {
			int freq[]=getFrequency(s1);
			boolean valid=true;
			for(int j=0;j<26;j++) {
				if(maxword2[j]>freq[j]) {
					valid=false;
					break;
				}
			}
			if(valid) {
				result.add(s1);
			}
		}
		
		return result;
	}
	
	private static int[] getFrequency(String s) {
		int arr[]=new int[26];
		for(char c:s.toCharArray()) {
			arr[c-'a']++;
		}
		return arr;
	}

}
