package leetcode;

public class ByeAndSellStock1 {
	
	public static void main(String[] args) {
		int array[]= {3,6,4,8,7,2,5};
		System.out.println(getResult(array));
	}

	private static int getResult(int[] array) {
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			if(array[i]-min>max) {
				max=array[i]-min;
			}
		}
		return max;
	}

}
