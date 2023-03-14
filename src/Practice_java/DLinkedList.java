package Practice_java;
public class DLinkedList {
	Node head, tail = null;  
	public void addNode(int data)
	{   
		Node newNode = new Node(data); 
        if(head == null) {  
        	head = tail = newNode;   
            head.previous = null;  
           tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }    
	public void deleteNode(int d) {
		Node curr=head;
		Node prev=null;
		while(curr!=null) {
			if(curr.data==d) {
				curr=curr.next;
				prev.next=curr;
			}
			prev=curr;
			curr=curr.next;
		}
		
	}
	public int search(int find) {
		Node temp = new Node(find); 
		Node current= head;
		System.out.print(temp.data);
		while(current!=null) 
		{
			if(temp.data == current.data) 
			{
				return 1;
			}
			else{
				current=current.next;
			}
		}
	    return -1;		
	}
    public void display() {   
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
}