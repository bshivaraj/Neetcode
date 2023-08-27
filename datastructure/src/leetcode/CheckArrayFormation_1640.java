package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckArrayFormation_1640 {

	public static void main(String[] args) {
		int arr[] = {37,69,3,74,46},pieces[][] = {{37,69,3,74,46}};
		//int arr[] = {91,4,64,78}, pieces[][] = {{78},{4,64},{91}};
		System.out.println(canFormArray(arr, pieces));
	}
	public static boolean canFormArray(int[] arr, int[][] pieces) {
		List<Integer> list=new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		 for(int i=0;i<arr.length;i++) {
   		  map.put(arr[i],i);
   	  }
		 for(int []tmp:pieces) {
			 if(tmp.length==1) {
				 if(!map.containsKey(tmp[0])) {
					 return false;
				 }
			 }else {
				 int temp = 0;
				 if(map.containsKey(tmp[0])) {
					 temp=map.get(tmp[0]);
				 }else {
					 return false;
				 }
				 for(int i=1;i<tmp.length;i++) {
					 if(temp==list.size()-1 && i!=tmp.length-1) {
						 return false;
					 }
					 if(temp<list.size()-1) {
						 if((tmp[i]!=list.get(++temp))) {
								return false;
							 }
					 }
				}
			 }
		 }
		return true;
	}
}
