package hackerrank;

import java.util.Arrays;

public class MaximumSubarray {
	
    public static void main(String[] args) {
    	 int nums[]= {-9,13,-12,89};
		System.out.println(getResult(nums));
	}

	private static int getResult(int[] nums) {
		int currentSum=0,result=0;
		boolean isNeg=getvalue(nums);
		if(isNeg){
			Arrays.sort(nums);
			return nums[nums.length-1];
		}
		for(int i=0;i<nums.length;i++){
			currentSum=currentSum+nums[i];
			if(currentSum<0){
				currentSum=0;
			}
			if(currentSum>result){
				result=currentSum;
			}
		}
		if(nums.length==1 && result==0){
			return nums[0];
		}
		return result;
	}

	private static boolean getvalue(int[] nums) {
		for(Integer i:nums){
			if(i>0){
				return false;
			}
		}
		return true;
	}

	
}
