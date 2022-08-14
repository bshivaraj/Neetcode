package leetcode;

class Node<T>{
	Node next;
	T data;
}
class MyLinkedList{
	Node head;
	
	public <T> void put(T data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void getNode() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

	public Node reverseList() {
		Node currentNode=head;
		Node nextnode=null;
		Node previousNode=null;
		while(currentNode.next!=null) {
			nextnode=currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextnode;
		}
		return previousNode;
	}
}


public class ReverseTheLinkedList {
	
	public static void main(String[] args) {
	MyLinkedList list=new MyLinkedList();
	list.put(1);
	list.put(2);
	list.put(3);
	list.getNode();
	System.out.println("rev........");
	Node node=list.reverseList();
	
	while(node.next!=null) {
		System.out.println(node.data);
		node=node.next;
	}
	
		
	}

}
