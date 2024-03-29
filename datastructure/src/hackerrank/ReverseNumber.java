package hackerrank;
public class ReverseNumber {
	
	public static void main(String[] args) {
		System.out.println(reverse(1056389759 ));
	}

	private static int reverse(int x) {
		 int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 ) return 0;
	            if (rev < Integer.MIN_VALUE/10 ) return 0;
	            rev = rev * 10 + pop;
	           
	        }
	        return rev;
	}

}
