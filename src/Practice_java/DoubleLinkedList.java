package Practice_java;
import java.util.*;
	class Node
	{  
        int data;  
        Node previous;  
        Node next;    
        public Node(int data) {  
            this.data = data;  
        }  
    }  
class DoubleLinkedList
{
    public static void main(String[] args) { 
    	Scanner input=new Scanner(System.in);
        DLinkedList dList = new DLinkedList(); 
        System.out.print("N number nodes - Enter N");
        int N=input.nextInt();
        System.out.println("Enter values");
        for(int i=0;i<N;i++) {
        	dList.addNode(input.nextInt());  
            
        }
        dList.display();  
        System.out.print("Enter value to search for");
        int numToSearch=input.nextInt();
        System.out.println(dList.search(numToSearch)==1?"FOUND":"NOT FOUND");
        System.out.print("Do you want to delete a random node from Doublelinked list enter 0 for no and 1 for yes");
        int op=input.nextInt();
        switch(op) {
        	case 0:
        		break;
        	case 1:
        		dList.deleteNode(input.nextInt());
        }
        dList.display();  
        
    } 
}

