package hackerrank;
import java.util.Arrays;
import java.util.List;

public class MarkToys {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);int k=7;
		int res=getResult(list,k);
		System.out.println(res);
	}

	private static int getResult(List<Integer> list, int k) {
		Integer array[]=new Integer[list.size()];int sum=0;int i=0;
		list.toArray(array);Arrays.sort(array);
	    while(i<array.length){
			sum=sum+array[i];
			if(sum>k){
				break;
			}
			i++;
		}
		return i;
	}
}
