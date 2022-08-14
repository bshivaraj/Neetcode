package dynamicprogram;

public class FindIsStringContainsDuplicateChar {
	
	public static void main(String[] args) {
		String s="abcdbhfgsaabbcd$h$";
		isunique(s);
	}

	private static void isunique(String s) {
		String output="";
		char[] c=s.toCharArray();
		boolean b[]=new boolean[256];
		for(int i=0;i<c.length;i++) {
			if(!b[c[i]]) {
				b[c[i]]=true;
				output=output+c[i];
			}
		}
		System.out.println("Unique String is "+output);
		
	}

}
