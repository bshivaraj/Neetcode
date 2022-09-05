package leetcode;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		int a[]= {7,1,5,3,6,4};
		System.out.println(maxProfit(a));
	}
	
	  public static int maxProfit(int[] prices) {
	      int min = Integer.MAX_VALUE;
	        int ans = Integer.MIN_VALUE;
	        for (int val: prices) {
	            min = Math.min(min, val);
	            ans = Math.max(ans, val - min);
	        }
	        return ans;
	    }

}
