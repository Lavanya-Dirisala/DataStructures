package Practice_java;

import java.util.Arrays;

public class SudukuValidation {
	public static void main(String args[]) {
		int[][] suduko=  { { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
                { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
                { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
                { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
                { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
                { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
                { 1, 3, 6, 7, 4, 8, 5, 9, 2 },
                { 9, 7, 4, 2, 1, 5, 6, 3, 8 },
                { 5, 2, 8, 6, 3, 9, 4, 1, 7 } };
		if(isvalid(suduko)) {
			System.out.print("IS VALID SUDUKO");
		}
		else {
			System.out.print("IS INVALID SUDUKO");
		}
	}

	private static boolean isvalid(int[][] suduko) {
		 boolean[] uniqueNumbers = new boolean[10];		 
		for(int row=0;row<9;row++) {
			Arrays.fill(uniqueNumbers,false);
			for(int col=0;col<9;col++) {
				int val=suduko[row][col];
				if(!(val<=0) && !(val>9) && !uniqueNumbers[val]) {
					uniqueNumbers[val]=true;
				}
				else {
					return false;
				}					
			}
		}
		for(int col=0;col<9;col++) {
			Arrays.fill(uniqueNumbers,false);
			for(int row=0;row<9;row++) {
				int val=suduko[col][row];
				if(!(val<=0) && !(val>9) && !uniqueNumbers[val]) {
					uniqueNumbers[val]=true;
				}
				else {
					return false;
				}					
			}
		}
		//3 x 3 matrix checking
		for(int row=0;row<7;row+=3) {			
			for(int col=0;col<7;col+=3) {
				Arrays.fill(uniqueNumbers,false);				
				for(int rowit=0;rowit<3;rowit++) {
					for(int colit=0;colit<3;colit++) {
						int rowindex= rowit+row;
						int colindex= colit+col;
						int val=suduko[rowindex][colindex];
						if(!(val<=0) && !(val>9) && !uniqueNumbers[val]) {
							uniqueNumbers[val]=true;
						}
						else {
							return false;
						}
					}
				}
				
			}
		}
		return true; 

}
}
