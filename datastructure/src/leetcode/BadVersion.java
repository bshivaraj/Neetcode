package leetcode;

import java.util.HashMap;
import java.util.Map;

public class BadVersion {
	
	public static void main(String[] args) {
		
		int result=firstBadVersion(3);
		System.out.println(result);
	}
	
	 public static int firstBadVersion(int n) {
		 int start=1,end=n, mid=0,result=0;
		 while(start<=end) {
			 mid=start+(end-start)/2;
			if(isBadVersion(mid)) {
				result=mid;
				end=mid-1;
			}else {
				start=mid+1;
			}
		 }
		 if(result!=0) {
			 return result;
		 }
		return -1;
	 }

	private static boolean isBadVersion(int n) {
		Map<Integer,Boolean> map=new HashMap<>();
		map.put(1, false);
		map.put(2, false);
		map.put(3, true);
		//map.put(4, true);
		//map.put(5, true);
		return map.get(n);
	}

}
