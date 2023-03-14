package Practice_java;

import java.util.Scanner;

class CircularLinkedlist{
	class Node{
	int data;
    Node previous;  
    Node next; 
	Node(int data)
	{
		this.data=data;
	}
	}
	public Node head = null;  
    public Node tail = null; 
	
	public void addingQueue(int key) {
		Node curr=new Node(key);
		if(this.head ==null) {
			head=curr;
			tail= curr;
			tail.next=head;
		}
		else {
			 tail.next=curr;
			 tail=curr;
			 curr.next=head;
		}
		
	}
//	public int search(int key) {
//		Node check=new Node(key);
//		Node curr=head;
//		while(curr!=null) {
//			if(curr.data==check.data) {
//				return 1;
//			}
//			else {
//				curr=curr.next;
//			}
//			
//		}
//		return -1;
//		
//	}
//	public void deleteNode(int key) {
//		Node curr=head;
//		Node pre=null;
//		while(curr!=null) {
//			if(curr.data==key) {
//				curr=curr.next;
//				pre=curr;
//			}
//			pre=curr;
//			curr=curr.next;
//		}
//	}
	public void display() {
		Node curr=head;
		do{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}while(curr!=head);
		
		}
	public static void main(String args[]) {
		CircularLinkedlist cq=new CircularLinkedlist();
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			cq.addingQueue(input.nextInt());
		}
		cq.display();
//		System.out.print("1. Search\n 2.Delete");
//		int op=input.nextInt();		
//		switch(op) {
//			case 1:
//				int qa=input.nextInt();
//				System.out.print(cq.search(qa)==1?"Found":"Not Found");
//			case 2:
//				cq.deleteNode(input.nextInt());
//				cq.display();
//		}
//		
	}
}
