package hackerrank;

import java.util.Date;

class Node<T>{
	Node next;
	T data;
	Node(T data){
		this.data=data;
	}
}

public class MyLinkedList {
	
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(2);
		head.next.next.next.next=new Node(1);
		MyLinkedList myLinkedList=new MyLinkedList();
	   // Node n=myLinkedList.insert(10,head,0);
		//traverse(myLinkedList.delete(1,head));
		//traverse(myLinkedList.reverse(head));
		boolean pal=ispalindrome(head);
	
	}
	
	private static boolean ispalindrome(Node head) {
		return false;
	}

	private Node reverse(Node head) {
		Node pre=null;
		Node cur=head;
		while(cur!=null){
			Node temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;
		}
		return pre;
	}

	private Node delete(int i, Node head) {
		if(i==0){
			head=head.next;
		}
		Node prv=head;
		for(int j=0;j<i-1;j++){
			prv=prv.next;
		}
		prv.next=prv.next.next;
		return head;
	}
	
	public static Node insert(int data,Node head,int position){
		Node newData=new Node(data);
		if(position==0){
			newData.next=head;
			head=newData;
		}
		return newData;
	}
	
	public static  void traverse(Node node){
		Node head=node;
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
		
	}

}
