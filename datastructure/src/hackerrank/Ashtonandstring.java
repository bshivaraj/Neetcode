package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ashtonandstring {
	
	public static void main(String[] args) {
		String s="dbac";int k=5;
		System.out.println(getchar(s,k));
	}

	private static char getchar(String s, int k) {
		String result="";
		List<String> list=new ArrayList();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				result=result+s.substring(i, j);
				list.add(result);
			}
		}
		String array[]=new String[list.size()];
		list.toArray(array);
		Arrays.sort(array);
		System.out.println(array[0]);
	
		return result.charAt(k-1);
	}

}
