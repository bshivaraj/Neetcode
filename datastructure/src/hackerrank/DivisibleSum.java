import java.util.Arrays;
import java.util.List;

public class DivisibleSum {
	public static void main(String[] args) {
		List<Integer> ar=Arrays.asList(1,2,3,4,5,6);
		int n=ar.size(),k=5;
		int res=getResult(n,k,ar);
		System.out.println(res);
	}

	private static int getResult(int n, int k, List<Integer> ar) {
		Integer a[]=new Integer[ar.size()];
		Arrays.sort(ar.toArray(a));
		int i=0,j=i+1,result=0;
		while(i<ar.size()){
			while(j<ar.size()){
				if((a[i]+a[j])%k==0){
					result++;
				}
				j++;
			}
			i++;
			j=i+1;
		}
		return result;
	}

}
