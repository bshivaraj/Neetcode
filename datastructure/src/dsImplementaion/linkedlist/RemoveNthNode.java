package dsImplementaion.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNode {
	public static void main(String[] args) {

		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.add(1);
		myLinkedList.add(2); 
		myLinkedList.add(3); 
		myLinkedList.add(4);
		myLinkedList.add(5);
		 
		myLinkedList.removeNthNode(2);
	}
}
