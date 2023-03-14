package Practice_java;

public class PolymorphismOverload {
	static double multiply(double d, double e) 
	{
		return d*e;
	}
	static double multiply(int a,int b,double c) 
	{
		return a*b*c;

	}

	static int multiply(int a,int b)
	{
	return a*b;
	}

	public static void main(String args[]) {

	System.out.println(multiply(4.00,3.00));

	System.out.println(multiply(1,4,3.0));

	System.out.println(multiply(4,3));
	}
	
}
