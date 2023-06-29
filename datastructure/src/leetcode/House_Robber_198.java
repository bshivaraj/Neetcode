package leetcode;

public class House_Robber_198 {
	
	public static void main(String[] args) {
		   int array[]= {1,2,1,4,1,1,100};
		   int res=getHouseAmount(array);
		   System.out.println(res);
		
		}

	private static int getHouseAmount(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int dp[]=new int[nums.length+1];
		dp[0]=0;
		dp[1]=nums[0];
		for(int i=1;i<nums.length;i++) {
			dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
		}
		return dp[nums.length];
	}
}
