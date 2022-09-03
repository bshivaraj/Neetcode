package hackerrank;
import java.util.HashMap;
import java.util.Map;

public class PowerSum {
	
	public static void main(String[] args) {
		int x=10,n=2;
		int arr[]={1,7,4,2,9,3};
		         //1,2,3,4,7,9
		getSum(arr,7);
		int result=getResult(x,n);
	}

	private static void getSum(int[] arr,int target) {
		
	}

	private static int getResult(int x, int n) {
		int sqrt=(int)Math.sqrt(x),i=1;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		while(i<=sqrt){
			map.put(i,(int)Math.pow(i, n));
			i++;
		}
		return 0;
	}

}
