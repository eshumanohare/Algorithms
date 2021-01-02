import java.util.*;
import java.io.*;

public class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buffer.readLine());
		int[][] grid = new int[n][n];
		printQueens(grid,n,0,0,"");
		
	}
	
	static void printQueens(int[][] grid, int size, int row,int col, String ans){
	    
	    if(row == size){
	        System.out.println(ans);
	        return;
	    }
	    
	    for(int i=0;i<size;i++){
	         if(isSafe(grid,row,i)){
    	        grid[row][i] = 1;
    	        printQueens(grid, size, row + 1,i,ans + row + "," + i + "\n");
    	        grid[row][i] = 0;
    	   }
	    }
	}
	
	static boolean isSafe(int[][] grid, int row, int col){
	    for(int i=row-1;i>=0;i--){
	        if(grid[i][col] == 1){
	            return false;
	        }
	    }
	    for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
	        if(grid[i][j] == 1){
	            return false;
	        }
	    }
	    for(int i=row-1,j=col+1;i>=0 && j < grid.length; i--,j++){
	        if(grid[i][j] == 1){
	            return false;
	        }
	    }
	    return true;
	}
}
