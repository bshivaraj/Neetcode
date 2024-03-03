package hackerrank;

public class kadensAlgorithm {
	
	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3,45};
		int res=getResult(arr);
		System.out.println(res);
	}

	private static int getResult(int[] arr) {
		int cur=0,res=0;
		for(int i=0;i<arr.length;i++) {
			cur=cur+arr[i];
			if(cur>res) {
				res=cur;
			}
			if(cur<0) {
				cur=0;
			}
		}
		return res;
	}
	
}
