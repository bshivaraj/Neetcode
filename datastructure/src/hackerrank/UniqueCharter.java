public class UniqueCharter {
	
	public static void main(String[] args) {
		boolean result=getShringUniqueOrNot("abcd");
		System.out.println(result);
	}

	private static boolean getShringUniqueOrNot(String string) {
		if(string.length()>128){
			return false;
		}
		boolean b[]=new boolean[128];
		for(int i=0;i<string.length();i++){
			int temp=string.charAt(i);
			if(b[temp]){
				return false;
			}
			b[temp]=true;
		}
		return true;
	}

}
