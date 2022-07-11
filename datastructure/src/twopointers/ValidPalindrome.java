package twopointers;

public class ValidPalindrome {
	public static void main(String[] args) {
		System.out.println(isPanlindrome("A man, a plan, a canal: Panama"));
	}

	private static boolean isPanlindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
		int j=s.length()-1;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}

}
