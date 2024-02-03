package target35;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

	public static void main(String[] args) {
		int arr[]= {2,11,7,15},target=9;
		int result[]=getIndexOfTarget(arr,target);
		System.out.println(result[0]+" "+result[1]);

	}

	private static int[] getIndexOfTarget(int[] arr,int target) {
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		int res[]=new int[2];
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],i);
		}
		for(int i=0;i<arr.length-1;i++) {
			int temp=target-arr[i];
			if(map.containsKey(temp)) {
				res[0]=map.get(temp);
				res[1]=i;
			}
		}
		return res;
	}

}
