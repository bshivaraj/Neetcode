package leetcode;

public class NearestTozero {

	public static void main(String[] args) {
		int arr[]= {15,20,-3,4,-10};
		System.out.println(getResult(arr));
	}
	
	public static int getResult(int ts[]) {
		 if(ts.length==0){
		        return 0;
		       }
		       int result=Integer.MAX_VALUE;
		       for(int i:ts){
		    	   int tmp=0;
		    	   if(i<0) {
		    		   tmp=0-i;
		    	   }else {
		    		   tmp=i-0;
		    	   }
		       
		        if(tmp<result){
		            result=tmp;
		        }
		       }
		        
		        return result;
	}

}
