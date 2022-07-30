package hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Hackerlandradiotransmitters {
	
	public static void main(String[] args) {
		int arry[]= {1,2,3,5,9};
		//1,2,3,4,5,6,7,8,9
				//2,5,9
		//int arry[]= {7 ,2, 4, 6, 5, 9, 12 ,11};
		//2,3,4,5,6,7,8,9,10,11,12
		//4,9,12
		
		int k=1;
		System.out.println(getResult(arry,k));
	}

	private static int getResult(int[] arry,int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arry);
		int start=arry[0],end=arry[arry.length-1],result=0,j=0;
		int[] a = IntStream.range(start, end).toArray();
		while(start<=end && j<=end) {
			 j=j+(2*k);
			 if(j<=end) {
				 start=a[j]; 
			 }
             j++;
             result++;
		}
		return result;
	}

}
