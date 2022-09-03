package hackerrank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(4,6,2,5,7,9,1,3);
		Integer i1[] =new Integer[list.size()];
		int l=0,h=list.size()-1;
		Integer [] array=list.toArray(new Integer[list.size()]);
		quickSort(l,h,array);
		List<Integer> list1=Arrays.asList(1,3,2);
		list1.stream().sorted().collect(Collectors.toList());
		System.out.println(Arrays.toString(array));
	}

	private static void quickSort(int l, int h, Integer[] array) {
         if(l<h){
        	 int pivot=partitian(l,h,array);
        	 quickSort(l, pivot-1, array);
        	 quickSort(pivot+1,h, array);
         }
	}

	private static int partitian(int l, int h, Integer[] array) {
		int i=l,j=h,pivot=array[i];
		while(i<j){
			while(pivot>=array[i]){
		    	  i++;
		      }
		      while(pivot<array[j]){
		    	  j--;
		      }
		      if(i<j){
		    	  swap(array,i,j);
		      }
		}
		swap(array,l,j);
      
      return j;
	}

	private static void swap(Integer[] array, int i, int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

	

}
