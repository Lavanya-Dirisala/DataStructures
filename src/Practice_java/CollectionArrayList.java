package Practice_java;
import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(12);
		arr.add(23);
		arr.add(45);
		//arrayList expands its size by 50%
		arr.add(6);
		arr.add(7);
		arr.add(89);
		arr.add(90);
		int maximum = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
		if (maximum < arr.get(i))
		maximum = arr.get(i);
		}
		System.out.println("Greatest Element is " + maximum);
	}
}
