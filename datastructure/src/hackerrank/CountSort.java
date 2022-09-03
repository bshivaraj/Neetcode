package hackerrank;

import java.util.Arrays;

public class CountSort {

	public static void main(String[] args) {
		int n[]={5,1,1,1,4,4,4,4};
		Arrays.sort(n);
		int i=0,temp=n[0],tmp=0,result=0;
		while(i<n.length){
			if(temp==n[i]){
				tmp++;
			}else {
				tmp=1;
			} if(tmp>result){
				result=tmp;
			}
			temp=n[i];
			i++;
		}
		System.out.println(result);
		
	}
}
