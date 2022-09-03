package LinkedList;
import LinkedList.*;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		Node node=reverseList(head);
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
	}
         //1,2,3,4
	     //
	private static Node reverseList(Node head) {
		Node prev=null,nextTemp;
	       while(head!=null){
	    	   nextTemp=head.next;
	    	   head.next=prev;
	    	   prev=head;
	    	   head=nextTemp;
	       }
		return prev;
	}

}
