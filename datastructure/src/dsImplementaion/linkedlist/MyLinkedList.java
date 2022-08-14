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
		System.out.println("------Inserted data in Linked in World is ending---");
		while(n.next!=null) {
			System.out.println(n.data);	
			n=n.next;
		}
		System.out.println(n.data);
	}

	public void reverseList(){
		Node currentNode=head;
		Node nextNode=null;
		Node previousNode=null;
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		Node head=previousNode;
		System.out.println("--------Reverse linkedlist New world is creating-------");
		while(head.next!=null) {
			System.out.println(head.data);
			head=head.next;
		}
		System.out.println(head.data);
	}



}
