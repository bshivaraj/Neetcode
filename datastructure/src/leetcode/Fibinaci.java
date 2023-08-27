package leetcode;

public class Fibinaci {
	
	private static long fibarray[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8000;
		fibarray=new long[n+1];
		long preTime=System.currentTimeMillis();
		  System.out.println("Value  fibonacci series->"+fibonacci(n));
		  long postTime=System.currentTimeMillis();
		  System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));
	}

	private static long fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		if(fibarray[n]!=0) {
			return fibarray[n];
		}
		fibarray[n]=fibonacci(n-1)+fibonacci(n-2);
		return fibarray[n];
	}

}
