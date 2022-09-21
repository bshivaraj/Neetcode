package leetcode;

public class LongestPalindrom_409 {
	
	public static void main(String[] args) {
		String s="abccccdd";
		int result=getResult(s);
		System.out.println(result);
	}

	private static int getResult(String s) {
		int charCounts[]=new int[128];
		int result=0;
		for(char c:s.toCharArray()) {
			charCounts[c]++;
		}
		//1,1,4,2
		for(Integer charCount:charCounts) {
			result+=charCount/2*2;
			if(result%2==0 && charCount%2==1) {
				result++;
			}
		}
		return result;
	}

}
