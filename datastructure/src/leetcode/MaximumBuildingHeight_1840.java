package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class MaximumBuildingHeight_1840 {

	public static void main(String[] args) {
		int building[][]= {{5,3},{2,5},{7,4},{10,3}};
		int n=5;
		int result=maxBuilding(n, building);
        System.out.println("result "+result);
	}
	
	 public static int maxBuilding(int n, int[][] restrictions) {
		 int result[]=new int [n];
		 result[0]=0;
		 if(restrictions.length==0) {
			 int i=1;
			while(i<n) {
				i++;
			}
			return i;
		 }
		 Map<Integer,Integer> map=new TreeMap<>();
		 extracted(restrictions, map);
		 for(int i=1;i<n;i++) {
			 
		 }
		return n;
	    }

	private static void extracted(int[][] restrictions, Map<Integer, Integer> map) {
		for(int tmp[]:restrictions) {
			map.put(tmp[0], tmp[1]);
		 }
	}

}
