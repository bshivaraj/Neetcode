package linearsearch;

public class FindGivenNumber {
	
	public static void main(String[] args) {
		int input=100;
		int arr[]= {1,2,4,55,10,22,34};
		if(findNumber(arr,input)) {
			System.out.println("Given Number is present in array: "+input);
		}else {
			System.out.println("Given Number is not present in array: "+input);
		}
		
	}

	private static boolean findNumber(int[] arr,int input) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==input) {
				return true;
			}
		}
		return false;
	}

}
