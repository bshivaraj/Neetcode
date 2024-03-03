package target35;

public class FindSingleNumberFromArray {

	public static void main(String[] args) {
        int array[]= {1,2,1,4,2,4,29,43,56,43,29};
        int t1=0;
        for(int i=0;i<array.length;i++) {
           int result=t1^array[i];
           t1=result;
        }
        System.out.println(t1);
     
        String s="abcba";
        boolean b[]=new boolean[25];
        char ar[]=s.toCharArray();
        for(int i=0;i<ar.length;i++) {
        	int temp=ar[i]-97;
        	if(b[temp]) {
        		b[temp]=false;
        	}else {
        		b[temp]=true;
        	}
        }
       
        for(int i=0;i<ar.length;i++) {
        	if(b[i]) {
        		System.out.println(ar[i]);
        	}
        }
       
     
	}

}
