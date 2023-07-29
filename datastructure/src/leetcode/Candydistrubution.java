package leetcode;

import java.util.Arrays;

public class Candydistrubution {
	
	public static void main(String[] args) {
		int arr[]={12,4,3,11,34,34,1,67};
		int result=getResult(arr);
		System.out.println(result);
	}

	private static int getResult(int[] arr) {
		int arrRight[] =new int[arr.length];
        Arrays.fill(arrRight, 1);
        int arrLeft[] =new int[arr.length];
        Arrays.fill(arrLeft, 1);
		int result=0;
		if(arr.length==0) {
			return result;
		}
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>arr[i+1]) {
				arrRight[i]=arrRight[i+1]+1;
			}
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				arrLeft[i]=arrLeft[i-1]+1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			result=result+Integer.max(arrLeft[i],arrRight[i]);
		}
		return result;
	}

}
