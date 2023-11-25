package leetcode;

import java.time.LocalDateTime;

public class Febinoicci_dynamic {
	
	//0,1,1,2,3,5,8,13,21
	public static void main(String[] argsgetFib) {
		int n=40,i=0,result=0;
		System.out.println("starting "+LocalDateTime.now);
		while(i<=n) {
	           result=getFib(i);
	           i++;
	        }
		 System.out.println(result);
	}

	private static int getFib(int n) {
		if(n<=1) {
			return n;
		}
		return getFib(n-1)+getFib(n-2);
	}

}
