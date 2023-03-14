package Practice_java;

public class InheritanceMain {
	public static void main(String[] args) {

		InheritanceAssociate a=new InheritanceAssociate();

		a.name();

		a.employeeID();

		System.out.println("Associate salary " + a.salary);

		int x=a.nightShiftAllowance();

		System.out.println("Total salary including Night shift allowance " + (a.salary + x));

		}
}
