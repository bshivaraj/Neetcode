package LinkedList;

public class SkipNodeFromLinkedlist {
	
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		Node node=getNode(head);
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
	}

	private static Node getNode(Node node) {
		Node head=node;
		while(node!=null && node.next!=null){
			Node nextNode=node.next;
			Node nextToNextNode=node.next.next;
			if(nextNode.data==(Object)3){
				node.next=nextToNextNode;
			}else{
				node=nextNode;
			}
		}
		return head;
	}

}
