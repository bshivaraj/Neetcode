package leetcode;

public class FirstDuplicateCharcter {

	public static void main(String[] args) {
		String s="abcbafggf";
		int arr[]=new int[25];
       System.out.println(extracted(s, arr));
	}

	private static char extracted(String s, int[] arr) {
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			arr[c-'a']++;
			if(arr[c-'a']==2) {
				return c; 
			}
		}
		return 0;
	}

}
