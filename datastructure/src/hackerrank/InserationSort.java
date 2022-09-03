package hackerrank;
import java.util.Arrays;

public class InserationSort {
	
	public static void main(String[] args) {
		Integer a[]={7,3,1,50,9,4,8};
		        //7,3,1,9,4,8
		      /*[3, 7, 1, 9, 4, 8]
				[1, 3, 7, 9, 4, 8]
				[1, 3, 7, 9, 4, 8]
				[1, 3, 4, 7, 9, 8]
				[1, 3, 4, 7, 8, 9]*/
		for(int i=1;i<a.length;i++){
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			System.out.println(Arrays.asList(a));
		}
	}

}
