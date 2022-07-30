package leetcode;

public class BuyAndSellStock2 {

	public static void main(String[] args) {
		int array[]= {5,2,6,1,4,7,3,6};
		System.out.println(getResult(array));
	}

	private static int getResult(int[] array) {
		int profit=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i+1]>array[i]) {
				profit+=array[i+1]-array[i];
			}
		}
		return profit;
	}

}
