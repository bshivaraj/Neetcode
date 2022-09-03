package hackerrank;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int nums[]={-1,-100,3,99};int k=2;
		getResult(nums,k);
	}

	private static void getResult(int[] nums,int k) {
		int i=0,start=nums.length-k;
		Integer res[]=new Integer[nums.length];
		while(i<nums.length){
			int j=0;
			while(start<nums.length){
				res[i]=nums[start];
				i++;
				start++;
			}
			start=nums.length-k;
			while(j<start){
				res[i]=nums[j];
				j++;
				i++;
			}
			
		}
		System.out.println(Arrays.toString(res).replace(" ",""));
	}

}
