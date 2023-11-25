package leetcode;

public class GasStation_134 {

	public static void main(String[] args) {
       int gas[]= {1,2,3,4,5},cost[]= {3,4,5,1,2};
      // int gas[]= {5,1,2,3,4},cost[]= {4,4,1,5,1};
       //4-1+5=8
       //8-2+1=7
       //7-3+2=6
       //6-4+3=5
       int res=getResult(gas,cost);
       System.out.println(res);
	}

	private static int getResult(int[] gas, int[] cost) {
		int totalGas=0,totalCost=0,n=gas.length;
		for(int i=0;i<gas.length;i++) {
			totalGas=totalGas+gas[i];
			totalCost=totalCost+cost[i];
		}
		if(totalGas<totalCost) {
			return -1;
		}
		int start=0,currentGas=0;
		for(int i=0;i<n;i++) {
			if(currentGas<0) {
				currentGas=0;
				start=i;
			}
			currentGas=currentGas+gas[i]-cost[i];
		}
		return start;		
	}

}
