package leetcode;

import java.util.Arrays;

public class PivotIndex {
	
	public static void main(String[] args) {
		//int arr[]= {2,1,-1};
		int arr[]= {1,7,3,6,5,6};
		int res=getData(arr);
		System.out.println(res);
	}

	private static int getData(int[] arr) {
	   int lSum=0,rSum=0,tSum=Arrays.stream(arr).sum();
		for(int i=0;i<arr.length;i++) {
			if(i>0) {
				lSum=lSum+arr[i-1];
			}
			if(i==0) {
				lSum=0;
			}
			rSum=tSum-(lSum+arr[i]);
			if(rSum==lSum){
				return i;
			}
		}
		return -1;
	}

}
