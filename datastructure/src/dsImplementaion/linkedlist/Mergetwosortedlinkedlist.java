package dsImplementaion.linkedlist;

public class Mergetwosortedlinkedlist {


	public static void main(String[] args) {
		 MyLinkedList<Integer> list1=new MyLinkedList<>();
		 list1.add(1);
		 list1.add(4);
		 list1.add(7);
	        
	     MyLinkedList<Integer> list2=new MyLinkedList<>();
	     list2.add(1);
	     list2.add(5);
	     list2.add(8);
	     
	     MyLinkedList<Integer> merge=new MyLinkedList<>();
	     Node res=merge.mergeTwoSortedLinkedList(list1.head,list2.head);
	     while(res!=null) {
	    	 System.out.println(res.data);
	    	 res=res.next;
	     }
	}


}
