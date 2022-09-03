package hackerrank;
import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubarraywithSumatK_862 {
	
	public static void main(String[] args) {
		int nums[]={1,5,6,-8,1,12};int k=10;
		int r=getResult(nums,k);
	}

	private static int getResult(int[] nums, int k) {
		int n = nums.length;
        Deque<long[]> dq = new ArrayDeque<long[]>();
        dq.offer(new long[]{-1,0});
        int i = 0;
        long curSum = 0;
        int res = Integer.MAX_VALUE;
        while(i < nums.length)
        {
            curSum += nums[i];
            while(!dq.isEmpty() && dq.peekFirst()[1] <= curSum - k) res = Math.min(res, (int)(i - dq.pollFirst()[0]));
            while(!dq.isEmpty() && dq.peekLast()[1] >= curSum) dq.pollLast();
            dq.offerLast(new long[]{i, curSum});
            i++;
        }
        return res == Integer.MAX_VALUE ? -1 : res;
	}

}
