package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMinandMax {

	public static void main(String[] args) {
		int []array={10,20,40,30,60,50};
		int k=2;
		int result=getResult(k,array);
		System.out.println(result);

	}

	private static int getResult(int k, int[] array) {
		PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
		for(int i=0;i<k;i++){
			pq.add(array[i]);
		}
		
		for(int i=k;i<array.length;i++){
			if(array[i]<pq.peek()){
				pq.poll();
				pq.add(array[i]);
			}
		}
		return pq.peek();
	}

}
