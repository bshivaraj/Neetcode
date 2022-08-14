package dsImplementaion.linkedlist;

public class MyLinkedList<T> {
		
	Node head;
	
	public void add(T data) {
		Node node=new Node(data);
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
	
	public void getAllData() {
		Node n=head;
		System.out.println("------Inserted data in Linked in:---");
		while(n.next!=null) {
			System.out.println(n.data);	
			n=n.next;
		}
		System.out.println(n.data);
	}



}
