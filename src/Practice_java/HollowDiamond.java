package Practice_java;

public class HollowDiamond {
	public static void main(String args[]) {
		int n=5;
		//TOP hollow diamond
		for(int row=1;row<=n;row++) {
			//for start stars
			for(int startstart=n;startstart>=row;startstart--) {
				System.out.print("*");
			}
			//for spaces
			for(int space=0;space<row*2-1;space++) {
				System.out.print(" ");
			}
			//for end stars
			for(int endstar=n;endstar>=row;endstar--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//BOTTOM hollow diamond
		for(int row=n-1;row>=1;row--) {
			//for start stars
			for(int startstart=n;startstart>=row;startstart--) {
				System.out.print("*");
			}
			//for spaces
			for(int space=0;space<row*2-1;space++) {
				System.out.print(" ");
			}
			//for end stars
			for(int endstar=n;endstar>=row;endstar--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
