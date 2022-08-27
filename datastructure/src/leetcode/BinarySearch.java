package leetcode;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		int arr[]= {-1,0,3,5,9,12},target=-2;
		int result=getresult(arr,target);
		System.out.println(result);
	}

	private static int getresult(int[] arr, int target) {
		int start=0,end=arr.length-1,mid=start+end/2;
		return getElement(arr,start,end,mid,target);
	}

	private static int getElement(int[] arr, int start, int end, int mid, int target) {
		while(start<=end) {
			mid=(start+end)/2;
			if(target==arr[mid]) {
				return mid;
			}
			if(target<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		   return getElement(arr, start, end, mid, target);
		}
		return -1;
	}

}
