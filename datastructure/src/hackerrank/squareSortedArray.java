package leetcode;

import java.util.Arrays;

public class squareSortedArray {
	public static void main(String[] args) {
		int nums[]={1,4,3,-9,22,-4};
		int[] k=getResult(nums);
	}

	private static  int[] getResult(int[] nums) {
		for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(i*i);
        }
		 Arrays.sort(nums);
        
        return nums;
	}

}
