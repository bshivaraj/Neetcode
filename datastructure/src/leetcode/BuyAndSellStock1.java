package leetcode;

public class BuyAndSellStock1 {
	
	public static void main(String[] args) {
		int array[]= {5,2,6,1,4};
		System.out.println(getResult(array));
	}

	private static int getResult(int[] array) {
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
				min=Math.min(array[i], min);
				max=Math.max(array[i]-min, max);
		}
		return max;
	}
}
