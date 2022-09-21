package leetcode;

import java.util.Arrays;

public class LongestSubArrayBySum {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,7,5};
		int s=12;
		int res[]=getResult(arr,s);
		for(int i=0;i<res.length;i++) {
		   System.out.println(res[i]);
		}
	}

	private static int[] getResult(int[] arr, int s) {
		int temp=0,start=0,end=0;
		for(int i=0;i<arr.length-1;i++) {
			int sum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
			   sum=sum+arr[j];
			   if(sum>s) {
				   break;
			   }
			   if(sum==s) {
				   if((j-i)>temp) {
					   temp=j-i;
					   start=i;
					   end=j;
				   }
			   }
			}
		}
		return Arrays.copyOfRange(arr, start, end+1);
	}
	

}
