package Practice_java;

public class StringManupulation {
	public static void main(String args[]){

		String s1="Welcome to Hyderabad";//creating string by Java string type1

		char ch[]={'s','t','r','i','n','g','s'};

		String s2=new String(ch);//creating string by Java string type2

		System.out.println(s1.length());//Length of string

		System.out.println(s1.toUpperCase());//converting to Uppercase

		System.out.println(s2.substring(2,5));//Substring

		System.out.println(s1.replace("Hyderabad","Chennai"));//Replace

		System.out.println(stringreverse(s1));
		StringBuffer sb = new StringBuffer("Java Programs");
		int length = sb.length();
		int capacity = sb.capacity();
		System.out.print(length + " " + capacity);
		StringBuilder sbb= new StringBuilder("Java Programs");
		System.out.println(sbb.substring(0,4));
		sbb.delete(0,4);
		}
		private static String stringreverse(String s1) {

		String rev="";

		for(int i=s1.length()-1;i>=0;i--) {

		rev+=s1.charAt(i);

		}
		return rev;
		}

}