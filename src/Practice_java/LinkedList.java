package Practice_java;
import java.util.Scanner;
class QNode {
		int key;
		QNode next;
		public QNode(int key)
		{
			this.key = key;
			this.next = null;
		}
	}
	class Queue {
		QNode front, rear;
		private Object temp;
		public Queue() { 
			this.front =null;
			this.rear = null;
			}
		void display() {
			QNode pre=this.front;
			while(pre!=null) {
				System.out.print(pre.key+" ");
				pre=pre.next;
			}
		}
		void enqueue(int key)
		{
			QNode temp = new QNode(key);
			if (this.rear == null) {
				this.front = this.rear = temp;
				return;
			}
			this.rear.next = temp;
			this.rear = temp;
		}
		void dequeue()
		{
			if (this.front == null)
				return;
			QNode temp = this.front;
			this.front = this.front.next;
			if (this.front == null)
				this.rear = null;
		}
		int search(int find)
		{
			QNode temp = new QNode(find); 
			QNode current= front;
			System.out.print(temp.key);
			while(current!=null) 
			{
				if(temp.key == current.key) 
				{
					return 1;
				}
				else{
					current=current.next;
				}
			}
		    return -1;		
	   }
	}		
public class LinkedList {
		public static void main(String[] args)
		{
			Queue q = new Queue();
			Scanner input=new Scanner(System.in);
			System.out.print("Choose any option");
			int op=input.nextInt();
			switch(op) {
				case 1:
					System.out.print("enter number to enqueue");
					int n=input.nextInt();
					for(int i=0;i<n;i++)
						{
						int num=input.nextInt();						
						q.enqueue(num);
						}
					break;
				case 2:
					System.out.print("enter number to dequeue");
					int num2=input.nextInt();
					q.enqueue(num2);
					break;									
			}
			System.out.print("enter number to search");  
			int num3=input.nextInt();
			System.out.println(q.search(num3)==1?"found":"Not found");	
			q.display();
		}
}