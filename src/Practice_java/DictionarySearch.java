package Practice_java;
import java.util.*;
public class DictionarySearch {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		Dictionary dict = new Hashtable(); 
		dict.put(10,"Ankit");
		dict.put(12,"Surya");
		dict.put(30,"Srikar");
		dict.put(28,"Lavanya");
		//getting all values from dict
		for(Enumeration em=dict.elements();em.hasMoreElements();) {
			System.out.print(em.nextElement());
		}
		//Searching in dict
		System.out.print("Ask for key to search for");
		int key=input.nextInt();
		System.out.print(dict.get(key));
		//removing all element in dict with keys
//		for(Enumeration em=dict.keys();em.hasMoreElements();) {
//			if(em.nextElement()==key) {
//				System.out.print("Key present in dictionary");
//			}
//		}
//				
		System.out.print(dict); 
	}
	
}