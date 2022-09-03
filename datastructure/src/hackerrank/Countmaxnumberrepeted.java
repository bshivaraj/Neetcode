package hackerrank;

import java.util.Arrays;

public class Countmaxnumberrepeted {
	
	public static void main(String[] args) {
		int n[]={5,1,4,1,1};
		//Arrays.sort(n);
		int j=0,count=0,result=0;
		for(int i=0;i<n.length;i++){
			int temp;
			while(j<n.length){
				temp=n[i];
				if(temp==n[j]){
					count++;
				}
				j++;
			}
			if(count>result){
				result=count;
			}
			j=0;
			count=0;
		}
		System.out.println(result);
	}

}
