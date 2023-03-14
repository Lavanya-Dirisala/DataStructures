package Practice_java;

public class CircularLinkedListChecker {
	boolean isCircular(MNode head) {
		MNode temp=head.next;
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

