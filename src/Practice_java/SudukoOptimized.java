package Practice_java;

import java.util.Arrays;
import java.util.HashSet;

public class SudukoOptimized {
	public static void main(String args[]) {
		Validation val =new Validation();
		int[][] suduko=  { { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
                { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
                { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
                { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
                { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
                { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
                { 1, 3, 6, 7, 4, 8, 5, 9, 2 },
                { 9, 7, 4, 2, 1, 5, 1, 3, 8 },
                { 5, 2, 8, 6, 3, 9, 4, 1, 7 } };
		if(val.isvalid(suduko)) {
			System.out.print("IS VALID SUDUKO");
		}
		else {
			System.out.print("IS INVALID SUDUKO");
		}
	}
}
	class Validation{
		public static boolean isvalid(int[][] board) {
		HashSet<String>set=new HashSet<>();
		String rowvalue = null ,colvalue = null, box =null;
		for(int row=0;row<9;row++) {
			for(int col=0;col<9;col++) {
				if(board[row][col]>0 && board[row][col]<=9) {
					 rowvalue="row"+row+board[row][col];
					 colvalue="col"+col+board[row][col];
					 box ="box"+(row/3)+(col/3)+board[row][col];
					if(set.contains(rowvalue)||set.contains(colvalue)||set.contains(box)) {
						return false;
			
					}
					}		
				set.add(rowvalue);
				set.add(colvalue);
				set.add(box);	
	}
		}
		return true;
		}
	}
	
