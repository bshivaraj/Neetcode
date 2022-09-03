package hackerrank;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SumOftwonumbers {
	
	public static void main(String[] args) {
		int arr[]={3,2,4};
		//2,7,11,15
	   int[] result=getresult(arr,6);
	   System.out.println(Arrays.toString(result));
	}

	private static int[] getresult(int[] nums, int target) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		 int arr[]=new int[2];
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}
		for(int i=0;i<nums.length;i++){
			int temp=target-nums[i];
			if(map.containsKey(temp) && map.get(temp)!=i){
				arr[0]=i;
				arr[1]=map.get(temp);
				return arr;
			}
		}
 		return arr;
	}

	/*private static int[] getresult(int[] nums, int target) {
		  int arr[]=new int[2];
	        int size=nums.length,i=0;
	        while(i<size){
	            for(int j=i+1;j<size;j++){
	                int temp=nums[i]+nums[j];
	                if(temp==target){
	                    arr[0]=i;
	                    arr[1]=j;
	                    return arr;
	                }
	            }
	            i++;
	        }
	        return arr;
	}*/

}
