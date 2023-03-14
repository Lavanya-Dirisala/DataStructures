package Practice_java;

public class OptimizedHollowPattern {
	public static void main(String[] args) {
		int n=5;
		makepattern(n);
	}

	private static void makepattern(int n) {
		int k=1;
		for(int row=1;row<=2*n+1;row++) {
			if(row>=n){k++;}
			System.out.println();
			for(int col=-n;col<=n;col++) {
				//System.out.print(-col);
				if((col>0?col:-col)<(row<=n?row:(row-2*k))) {
					System.out.print(" -");
				}
				else {
					System.out.print("*");
				}
			}
		}


	}
}