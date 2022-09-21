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
	public Node<Integer> mergeTwoSortedLinkedList(Node<Integer> n1, Node<Integer> n2) {
		//merge
		Node node =new Node(0);
		Node curNode=node;
		while(n1!=null && n2!=null) {
			if(n1.data<=n2.data) {
				curNode.next=n1;
				n1=n1.next;
			}else {
				curNode.next=n2;
				n2=n2.next;
			}
			curNode=curNode.next;
		}
		if(n1!=null) {
			curNode.next=n1;
			n1=n1.next;
		}
		if(n2!=null) {
			curNode.next=n2;
			n2=n2.next;
		}
		return node.next;
	}

	public void removeNthNode(int n) {
		Node dummy=new Node(0);
		dummy.next=head;
		
		Node slow=dummy;
		Node fast=dummy;
		
		for(int i=1;i<=n+1;i++) {
			fast=fast.next;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		
		slow.next=slow.next.next;
	        Node n1=dummy.next;
			System.out.println("--------Remove nth node linkedlist New world is creating-------");
			while(n1.next!=null) {
				System.out.println(n1.data);
				n1=n1.next;
			}
			System.out.println(n1.data);
	        
	        
		
	}





}
