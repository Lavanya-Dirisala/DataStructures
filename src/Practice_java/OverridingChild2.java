package Practice_java;

public class OverridingChild2 extends OverridingParent{
	void print() 
	{

		System.out.println("I am child2");

	}
	public static void main(String args[]) {

		OverridingParent ch;

		//Parent method gets overriding with the child method

		ch= new OverridingChild2();

		ch.print();

		ch= new OverridingChild1();

		ch.print();
}

}