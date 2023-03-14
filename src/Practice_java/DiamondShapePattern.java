package Practice_java;
public class DiamondShapePattern {
	public static void main(String args[]) {
		int size = 5;
		//top pyramid
		for(int toprow=1;toprow<=size;toprow++) {
			for(int space=size;space>toprow;space--) {
				System.out.print(" ");
			}
			for(int star=0;star<toprow*2-1;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//bottom pyramid
		for(int downrow=size;downrow>0;downrow--)
	 {
		for(int space=size;space>downrow;space--) {
			System.out.print(" ");
		}		
			for(int star=0;star<downrow*2-1;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
