package linearsearch;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,45,86};
		int target=7,start=0,
				end=arr.length-1,
				mid=(arr.length)/2;
		System.out.println(getNumber(arr,target,start,end,mid));
	}

	private static int getNumber(int[] arr, int target, int start, int end, int mid) {
	     if(arr[mid]==target) {
	    	 return target;
	     }
	     if(start>end) {
	    	 return -1;
	     }
			if (target > arr[mid]) {
	    	 start=mid+1;
	    	 end=arr.length-1;
	    	 mid=(start+end)/2;
	    	return getNumber(arr, target, start, end, mid);
	     }
	     if(target<arr[mid]) {
	    	 start=0;
	    	 end=mid-1;
	    	 mid=(start+end)/2;
	    	return getNumber(arr, target, start, end, mid);
	    	 
	     }
		return mid;
	}

	

}
