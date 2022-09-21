package leetcode;

public class MinCostClimbingStairs_746 {

	public static void main(String[] args) {
     int cost[]= {10,15,20};
     System.out.println(minimum(cost));
	}

	private static int minimum(int[] cost) {
		int result=2;
		if(cost.length==0) {
			return 0;
		}
		int start=0;
		if(cost[0]>cost[1]) {
			start=1;
		}
		for(int i=start;i<cost.length;i++) {
			if(cost[i+1]>cost[i+2]) {
				result=result+cost[i+2];
				i=i+2;
			}else {
				result=result+cost[i+1];
				i=i+1;
			}
		}
		return result;
	}

}
