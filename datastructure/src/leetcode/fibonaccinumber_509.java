package leetcode;

import java.util.Arrays;

public class fibonaccinumber_509 {
	
	public static void main(String[] args) {
		int n=15;
		int res=fib(n);
		System.out.println(res);
	}

	private static int fib(int n) {
		int res = 0;
		Integer arr[]=new Integer[128];
		Arrays.fill(arr, -1);
		arr[0]=0;arr[1]=1;
		while(n>=1) {
			if(arr[n]!=-1) {
				return arr[n];
			}else {
				arr[n]=fib(n-1)+fib(n-2);
			}
			return fib(n-1)+fib(n-2);
		}
		return res;
	}

}
