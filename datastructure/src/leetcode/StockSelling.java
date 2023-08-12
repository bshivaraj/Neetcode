package leetcode;

public class StockSelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,4,9,13};
          int res=getResult(arr);
          System.out.println(res);
	}

	private static int getResult(int[] arr) {
		int min=arr[0],result=0;
		for(int i=0;i<arr.length;i++) {
			min=Integer.min(min, arr[i]);
			int temp=arr[i]-min;
			result=Integer.max(result, temp);
		}
		return result;
	}

}
