package target35;

import java.util.Arrays;

public class MaximunSubArray {

	public static void main(String[] args) {
         int nums[]= {-9,13,-12,89};
         int currentSum=0,result=0;

 		
 		for(int i=0;i<nums.length;i++){
 			currentSum=currentSum+nums[i];
 			if(currentSum<0){
 				currentSum=0;
 			}
 			if(currentSum>result){
 				result=currentSum;
 			}
 		}
 		System.out.println(result);
 		
 
	}

}
