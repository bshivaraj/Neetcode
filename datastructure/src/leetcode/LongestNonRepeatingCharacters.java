package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingCharacters {

	public static void main(String[] args) {
        String s="abcdaafghijjklm";
        int result=getResult(s);
        System.out.println("result  "+result);
        
	}

	private static int getResult(String s) {
		
		char arr[]=s.toCharArray();
		Set<Character> set=new HashSet<Character>();
		int i=0,j=1,res=1,target=0;
		while(i<arr.length-1) {
			while(j<arr.length) {
				if(set.add(arr[j])) {
					res++;
				}else {
					target=Integer.max(target, res);
					res=0;i++;j=i+1;
					break;
				}
				j++;
			}
		}
		return target;
	}

}
