package dynamicprogram;

import java.util.Arrays;

public class CoinsChangeProblem {
	
	public static void main(String[] args) {
		int a[]= {7,5,1};
		int n=18;
		int dp[]=new int[n+1];
		Arrays.fill(dp,-1);
		dp[0]=0;
		int res=minCoins(n,a,dp);
		System.out.println(res);
		for(int x:dp) {
			System.out.print(x+" ");
		}
	}

	private static int minCoins(int n, int[] a,int dp[]) {
		int ans=Integer.MAX_VALUE;
		int min=0;
		if(n==0)
		  return 0;
		for(int i=0;i<a.length;i++) {
			if(n-a[i]>=0) {
				if(dp[n-a[i]]!=-1) {
					min=dp[n-a[i]];
				}else {
					min=minCoins(n-a[i], a, dp);
					dp[n-a[i]]=min;
				}
				if(min+1<ans) {
					ans=min+1;
				}
			}
		}
		return ans;
	}
}
