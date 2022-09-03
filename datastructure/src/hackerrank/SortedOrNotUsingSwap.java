import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedOrNotUsingSwap {

	public static void main(String[] args) {
       // List<Integer> arr=Arrays.asList(1 ,5 ,4 ,3 ,2 ,6);
        List<Integer> arr=Arrays.asList(1 ,5 ,3 ,4 ,2 ,6);
        almostSorted(arr);
	}

	private static void almostSorted(List<Integer> arr) {
		if(arr.size()==1 || isSorted(arr)){
			System.out.println("yes");
			return;
		}
		if(arr.size()==2){
			System.out.println("yes");
			System.out.println("swap 1 2");
			return;
		}
		
		if(!checkReverse(arr) && !checkSwap(arr)){
			System.out.println("no");
		}
	}
	
   private static boolean checkSwap(List<Integer> arr) {
	   boolean issorted=false;
	   Integer[] ar = arr.toArray(new Integer[arr.size()]);
	   Collections.sort(arr);
	   int start=0,end=0,t1=0,count = 0;
	   //1,5,3,4,2,6
	   //1,2,3,4,5,6
	   for(int i=0; i< ar.length-1;i++){
		   if(arr.get(i)!=ar[i]){
			   count++;
			   if(t1==0){
				   start=i+1;
			   }
			   else{
				   end=i+1;
			   }
			   t1++;
		   }
	   }
	  if(count==2){
		  issorted=true;
		  System.out.println("yes");
		  System.out.println("swap "+start+" "+end);
	  }
		return issorted;
	}

private static boolean checkReverse(List<Integer> arr) {
	   int start=0,end=0,ide=0;
	   for(int i=0;i<arr.size()-1;i++){
		   if(arr.get(i)>arr.get(i+1)){
			   ide++;
			   end=i+1;
		   }
		   if(ide==1){
			   start=i;
		   }
	   }
	    List<Integer> rev=revers(arr,start,end);
		boolean isRevers=isSorted(rev);
		if(isRevers && arr.size()>3){
			start++;
			end++;
			System.out.println("yes");
			System.out.println("reverse "+start+" "+end);
		}
		return isRevers;
	}


	private static List<Integer> revers(List<Integer> arr,int start,int end) {
		 Integer[] ar = arr.toArray(new Integer[arr.size()]);
		while(start<=end/2){
			int temp=ar[start];
			ar[start]=ar[arr.size()-1-start];
			ar[arr.size()-1-start]=temp;
			start++;
		}
		
	return Arrays.asList(ar);
}

	private static boolean isSorted(List<Integer> myList) {
		List<Integer> tmp = new ArrayList(myList);
		Collections.sort(tmp);
		return tmp.equals(myList);
	}

	
}
