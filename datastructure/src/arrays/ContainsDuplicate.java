package arrays;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
	
	     int nums[] = {1,2,3,4,-1};
		System.out.println(containsDuplicate(nums));
	}
     public static boolean containsDuplicate(int[] nums) {
    	boolean b[]=new boolean[128];
    	for(int i=0;i<nums.length;i++) {
    		if(b[nums[i]]) {
    			return true;
    		}
    		b[nums[i]]=true;	
    	}
		return false;
    }

}
