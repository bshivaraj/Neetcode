package hackerrank;

public class StringPermutation {
	
	public static void main(String[] args) {
		String s="abc",curString="";
		int i = 0;
		permutation(s,i,curString);
	}

	private static void permutation(String s, int i, String curString) {
		if(i==s.length()) {
			System.out.println(curString);
			return;
		}
		permutation(s,i+1,curString+s.charAt(i));
		permutation(s,i+1,curString);
		
	}

}
