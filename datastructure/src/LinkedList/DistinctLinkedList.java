package LinkedList;
import java.util.HashSet;
import java.util.Set;

public class DistinctLinkedList {
    public static void main(String[] args) {
        Set<Integer> list=new HashSet<Integer>();
      Node node=new Node(1);
      node.next=new Node(2);
      node.next.next=new Node(3);
      node.next.next.next=new Node(1);
      node.next.next.next.next=new Node(2);
      node.next.next.next.next.next=new Node(4);
        addDistinctList(node,list);
        Node n=distinctNode(list,new Node(0));
        readLinkedList(n);
    }

    private static void readLinkedList(Node n) {
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
       System.out.println(n.data);
    }

    private static Node distinctNode(Set<Integer> list,Node node) {
        Node n=node;
        for(Integer t:list){
            while(n.next!=null){
                n=n.next;
            }
            n.next=new Node(t);
        }
        return node;
    }

    private static Set<Integer> addDistinctList(Node node, Set<Integer> list){
        Node n=node;
       while(n.next!=null){
           if(!list.add((Integer) n.data)){
              list.remove(n.data);
           }

           n=n.next;
       }
        if(!list.add((Integer) n.data)){
            list.remove(n.data);
        }
       return  list;
    }
}
class Node<T>{
    Node next;
    T data;
    Node(T data){
        this.data=data;
    }
}