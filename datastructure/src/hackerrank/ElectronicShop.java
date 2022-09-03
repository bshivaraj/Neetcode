
package hackerrank;
public class ElectronicShop {

	public static void main(String[] args) {
		int []k={3,1};
		int []u={5,2,8};
		System.out.println(getResult(k,u,10));
	}

	private static int getResult(int[] k, int[] u, int b) {
		int sum=0;
		for(int i=0;i<k.length;i++){
			for(int j=0;j<u.length;j++){
				int t=k[i]+u[j];
				if(t>sum && t<=b){
					sum=t;
				}
			}
		}
		if(sum==0){
			return -1;
		}
		return sum;
	}
}
