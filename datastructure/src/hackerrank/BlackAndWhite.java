package hackerrank;
import java.util.Scanner;

public class BlackAndWhite {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int b=3,w=3,bc=1,wc=9,z=2;
		System.out.println(taumBday(b,w,bc,wc,z));
	}
	
	 private static long taumBday(int b, int w, int bc, 
			 int wc, int z) {
		 long priceB = Math.min(bc, wc + z); // conversion price
         long priceW = Math.min(wc, bc + z); // conversion price
         return b * priceB + w * priceW;
	}
}
