package Practice_java;

import java.util.HashMap;
import java.util.Map;

public class CollectiionHashMap {
	public static void main(String args[]) {
		String s="Lavanya";
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
		if(map.containsKey(s.charAt(i))){
		map.put(s.charAt(i),map.get(s.charAt(i))+1);
		}
		else{
		map.put(s.charAt(i),1);
		}
		}
		for(Map.Entry m:map.entrySet())
		{

			System.out.println(m.getKey()+" "+m.getValue());

		}
	}

}
