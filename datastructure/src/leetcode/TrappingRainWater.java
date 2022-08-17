package leetcode;

public class TrappingRainWater {
	
	public static void main(String[] args) {
		int array[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int res=getResult(array);
		System.out.println(res);
	}
	
	public static int getResult(int array[]) {
		int res=0,lMax=0,rMax=0;
		int leftArray[]=new int[array.length];
		int rightArray[]=new int[array.length];
		for(int i=0;i<array.length;i++) {
			if(lMax<array[i]) {
				lMax=array[i];
			}
			leftArray[i]=lMax;
		}
		for(int i=array.length-1;i>=0;i--) {
			if(rMax<array[i]) {
				rMax=array[i];
			}
			rightArray[i]=rMax;
		}
		for(int i=0;i<array.length;i++) {
			res=res+Math.min(leftArray[i],rightArray[i])-array[i];
		}
		return res;
	}

}
