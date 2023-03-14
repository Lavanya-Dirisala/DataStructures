package Practice_java;

class MNode{
	int data;
	MNode next;
	MNode(int data){this.data=data;}

}
class CreateLinkedList {
	private static final int MAXIMUM_SIZE = 10;
	static int size=1;
	static MNode head=null;
	public void add(int data) {
		if(size<=MAXIMUM_SIZE) {
			MNode node = new MNode(data);
			if (head == null) {
				head = node;
				node.next = head;
			} else {
				MNode current = head;
				while (current.next != head) {
					current = current.next;
				}
				current.next = node;
				node.next = head;
			}
			size++;
		}
		else {
			System.out.print("Limit Exceeded insertion stopped at "+ size);
		}
	}
}
public class LinkedListWithMaxSize {
	public static void main(String args[]) {
		CreateLinkedList list=new CreateLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);   	
		CircularLinkedListChecker checker = new CircularLinkedListChecker();
		System.out.println(checker.isCircular(list.head)); 
	}
}
