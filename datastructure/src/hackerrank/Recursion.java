package hackerrank;
public class Recursion {
	
	public static void main(String[] args) {
		int result=getResult(4);
		System.out.println(result);
		
	}

	private static int getResult(int n) {
		if(n<=1){
			return 1;
		}
		return n*getResult(n-1);
	}
}
