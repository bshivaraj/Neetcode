package leetcode;

public class LongestSubArray {
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10},sum=15;
		int res[]=getBounderies(arr,sum);
		System.out.println(res[0]+"  "+res[1]);
	}

	private static int[] getBounderies(int[] arr, int sum) {
		int res[]=new int[2];int diff=0;
		for(int i=0;i<arr.length-1;i++) {
			int temp=arr[i],t1=0,j2=0;
			for(int j=i+1;j<arr.length;j++) {
				 temp=temp+arr[j];
				 if(temp==sum) {
					 j2=j;
					 t1=j-i;
				 }
			}
			if(t1>diff) {
				diff=t1;
				res[0]=i+1;
				res[1]=j2+1;
			}
		}
		return res;
	}

}
