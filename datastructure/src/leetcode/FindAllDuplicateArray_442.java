package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicateArray_442 {
	
	public static void main(String[] args) {
		int nums[]= {4,3,2,7,8,2,3,1};
		List<Integer> res=extracted(nums);
	    System.out.println(res);
	}

	private static List<Integer> extracted(int[] nums) {
		List<Integer> list=new ArrayList<>();
		Integer arr[]=new Integer[128];
		Set<Integer> set=new HashSet();
		for(int i:nums) {
			if(!set.add(i)) {
				list.add(i);
			}
		}
		return  list;
	}

}
