public class LongestPalindrome {
	
	public static void main(String[] args) {
		String name="babad";
		String temp=getresult(name);
		System.out.println(temp);
	}

	private static String getresult(String s) {
		String result="";int len=0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++){
				String tmp=s.substring(i,j);
				boolean isPalindrome=isPalindrome(tmp);
				if(isPalindrome && tmp.length()>len){
					len=tmp.length();
					result=tmp;
				}
			}
		}
		return result;
	}

	private static boolean isPalindrome(String substring) {
		int size=substring.length()-1;
		for(int i=0;i<substring.length();i++){
			if(substring.charAt(i)!=substring.charAt(size)){
				return false;
			}
			size--;
		}
		return true;
	}

}
