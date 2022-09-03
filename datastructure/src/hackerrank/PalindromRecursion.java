public class PalindromRecursion {
	
	public static void main(String[] args) {
		String s="abcdcba";
		System.out.println(isPal(s,0,s.length()-1));
	}

	private static boolean isPal(String string, int l, int r) {
		if(l>=r){
			return true;
		}
		if(string.charAt(l)!=string.charAt(r)){
			return false;
		}
		return isPal(string, l+1, r-1);
	}

}
