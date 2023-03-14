package Practice_java;
import java.util.*;
//In order
public class LinkedHashMap {
	public static void main(String[] args) {
		String s="Lavanya is very good good girl";
		LinkedHashMap<String,Integer>map=new LinkedHashMap<String,Integer>();
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++){
		if(map.containsKey(words[i])){
		map.put(words[i],map.get(words[i])+1);
		}
		else{
		map.put(words[i],1);
		}
		}
		for(Map.Entry m:map.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}
		}
}
