package Practice_java;

import java.util.Scanner;
public class IsCircularOrSingleLL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}		
	}
	public class LinkedList {
		private static final int MAXIMUM_SIZE = 3;
		static int size=1;
	static Node head=null;
	public void add(int data) {
	 if(size<=MAXIMUM_SIZE) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
        size++;
	 }
    }
	private boolean isCircular(Node head) {
	Node temp=head.next;
	if(head==null) {
		return true;
	}
	else {
		while(temp!=null && temp!=head) {
			temp=temp.next;			
	    }
	}
	return (temp==head);
}
	}

	public static void main(String args[]) {
	LinkedList list=new LinkedList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);   	
	Object head = null;
	System.out.print(list.isCircular((Node) head));
}
}