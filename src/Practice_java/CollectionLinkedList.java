package Practice_java;
import java.util.LinkedList;
public class CollectionLinkedList {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("Goa");
		list.add("Mumbai");
		list.addFirst("Kerala");
		list.addLast("Hyderabad");
		System.out.println(list.getFirst());
		for(String s:list) {
		System.out.println(s);
		}
	}
}
