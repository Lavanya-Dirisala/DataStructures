package Practice_java;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet {
	public static void main(String[] args) {
		HashSet<Integer>set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
		System.out.print(i.next()+" ");
		}
}
}
