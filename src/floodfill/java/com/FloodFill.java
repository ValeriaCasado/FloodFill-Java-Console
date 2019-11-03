package floodfill.java.com;
import java.util.Arrays;


public class FloodFill {
	static int width = 9;
	private int[][] array = {{1,2,2,1,1,1,1,1,1,1},{1,2,1,2,1,1,1,2,2,2},{1,2,2,2,1,1,1,2,1,2},{1,1,1,1,1,1,1,2,1,2},{1,1,1,1,1,1,1,2,1,2},{1,1,1,1,1,1,1,2,1,2}};
	
	public FloodFill(){
		super();
	}

	public void floodFillArray(int row, int col, int change) {
		int number = array[row][col];
		
		int rows = array.length;
		
		for (int f_col = col; f_col <= width; f_col ++) {
			for (int f_row = row; f_row < rows; f_row ++) {
				if(array[f_row][f_col] != number) {
					break;
				}
				array[f_row][f_col] = change;
			}
		}
		for (int f_row = row; f_row < rows; f_row ++) {
			for (int f_col = col; f_col <= width; f_col ++) {
				if(array[f_row][f_col] != number && array[f_row][f_col] != change ) {
					break;
				}
				array[f_row][f_col] = change;
			}
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		int rows = array.length;
		for (int row = 0; row < rows; row ++) {
			for (int col = 0; col <= width; col ++) {
				sb.append(array[row][col] + " ");
			}
			sb.append("\n");
		}
		sb.append("\n");
		return sb.toString();
	} 
	
}
