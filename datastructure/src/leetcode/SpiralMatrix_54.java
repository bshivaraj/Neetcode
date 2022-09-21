package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
	
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4,5},
				         {6,7,8,9,10},
				         {11,12,13,14,15},
				         {16,17,18,19,20},
				         {21,22,23,24,25}};
		List<Integer> res=getResult(matrix);
		System.out.println(res);
	}

	private static List<Integer> getResult(int[][] matrix) {
		int T,B,L,R,dir;
	    T=0;
	    B=matrix.length-1;
	    L=0;
	    R=matrix[0].length-1;
	    dir=0;
	    int i;
	    List <Integer> ans = new ArrayList<>();
	    
	    while(T<=B && L<=R)
	    {
	        if(dir==0)
	        {
	            for(i=L;i<=R;i++)
	                ans.add(matrix[T][i]);
	            T++;
	        }
	        else if(dir==1)
	        {
	            for(i=T;i<=B;i++)
	                ans.add(matrix[i][R]);
	            R--;
	        }
	        else if(dir==2)
	        {
	            for(i=R;i>=L;i--)
	                ans.add(matrix[B][i]);
	            B--;
	        }
	        else if(dir==3)
	        {
	            for(i=B;i>=T;i--)
	                ans.add(matrix[i][L]);
	            L++;
	        }
	        dir=(dir+1)%4;
	    }
	    return ans;
	}
}
