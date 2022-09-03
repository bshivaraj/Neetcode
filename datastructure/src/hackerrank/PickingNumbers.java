package hackerrank;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4 ,6 ,5 ,3 ,3 ,1);
		System.out.println(getResult(list));
	}

	private static int getResult(List<Integer> list) {
		int result=0,j=0,i=1,tmp=1;
		Integer ar[]=new Integer[list.size()];
		list.toArray(ar);
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		while(j<ar.length){
			while(i<ar.length){
				int t=Math.abs(ar[j]-ar[i]);
				if(t>=2 && result<tmp){
					result=tmp;
					tmp=0;
				}
				if(t<=1){
					tmp++;
					i++;
				}else{
					j=i;
				}if(i>=ar.length){
					j=i;
				}
		}
		}
		return result;
	}

}
