import java.util.*;
public class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		printPaths(rows,cols,0,0,"");
	}
	public static void printPaths(int rows, int cols, int rowIndex, int colIndex, String ans){
	    if(rowIndex == rows-1 && colIndex == cols - 1){
	        System.out.println(ans);
	        return;
	    }
	    if(colIndex < (cols-1)){
	        printPaths(rows, cols, rowIndex, colIndex + 1, ans + "H");
	    }
	    if(rowIndex < (rows-1)){
	        printPaths(rows, cols, rowIndex+1, colIndex, ans + "V");
	    }
	}
}
