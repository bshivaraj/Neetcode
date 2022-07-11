package slidingwindow;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		int nums[]= {7,1,5,3,6,4};
		 //int nums[]= {1,2};
           System.out.println(getProfit(nums));

	}

	private static int getProfit(int prices[]) {
		int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int val: prices) {
            min = Math.min(min, val);
            ans = Math.max(ans, val - min);
        }
        return ans;
	}

}
