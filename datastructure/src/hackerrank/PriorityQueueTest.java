package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	public static void main(String[] args) {
	   PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.add(15);
		pq.add(10);
		pq.add(7);
		
		while(!pq.isEmpty()){
			System.out.println(pq.peek());
			pq.poll();
		}
		
	}

}
