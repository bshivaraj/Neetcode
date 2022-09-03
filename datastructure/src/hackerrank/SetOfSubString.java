public class SetOfSubString {
	
	public static void main(String[] args) {
		String s="abc";
		getAllSubString(s,0,"");
	}

	private static void getAllSubString(String s,int i,String cur) {
		if(i==s.length()){
			System.out.print(cur+" ");
			return;
		}
		//System.out.print(cur);
		getAllSubString(s,i+1,cur+s.charAt(i));
		getAllSubString(s,i+1,cur);
	}

}
