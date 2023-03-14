package Practice_java;

public class InterfaceChild implements InterfaceFather,InterfaceMother{

	@Override
	public void nationality() {
		System.out.println("Nationality: Indian");
	}

	@Override
	public void skinTone() {
		// TODO Auto-generated method stub
		System.out.println("Colour: fair");
	}

	@Override
	public double height() {
		// TODO Auto-generated method stub
		return 5.2;
	}

	@Override
	public void surname() {
		System.out.println("Surname: Kandavalli");
			
	}

	@Override
	public void religion() {
		System.out.println("Religion: Hindu");
		}	
	
	public static void main(String args[]) {

		InterfaceChild ch= new InterfaceChild();

		System.out.println(ch.height());

		ch.nationality();

		ch.surname();

		}
}
