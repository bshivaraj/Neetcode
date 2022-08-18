package leetcode;

public class IsSubsequence_392 {
	
	public static void main(String[] args) {
		//String s = "", t = "ahbgdc";
	 	String s = "abc", t = "";
		boolean res=getResult(s,t);
		System.out.println(res);
	}

	private static boolean getResult(String s, String t) {
		int i=0,j=0,iSize=s.length(),jSize=t.length();
		if(s.isEmpty() || (s.isEmpty() && t.isEmpty())) {
			return true;
		}
		if(iSize>jSize ) {
			return false;
		}
		while(i<iSize && (j!=jSize)) {
			char temp=s.charAt(i);
			boolean isEqual=false;
			while(j<jSize) {
				if(temp==t.charAt(j)) {
					i++;
					j=j+1;
					isEqual=true;
					break;
				}else{
					j++;
				}
			}if(!isEqual) {
				return false;
			}
			if(i==iSize) {
				return true;
			}
		}
		return false;
	}

}
