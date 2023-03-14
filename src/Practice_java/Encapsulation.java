package Practice_java;

public class Encapsulation {
	private String name;
	private int age;

	public String getName() {

	return name;

	}

	public int getAge() {

	return age;

	}
	public void setName(String setname) {
	name=setname;
	}
	void setAge(int setage) {
	age=setage;
	}
	public static void main(String args[]) {
		Encapsulation en= new Encapsulation();
		en.setName("Lavanya");
		en.setAge(22);
		System.out.print(en.getName() + " ");
		System.out.print(en.getAge());
	}
}
