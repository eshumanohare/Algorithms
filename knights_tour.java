import java.util.*;
import java.io.*;

public class knights
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        String[] i2 = buffer.readLine().split(" ");

        int x = Integer.parseInt(i2[0]);
        int y = Integer.parseInt(i2[1]);
        int[][] grid = new int[n][n];
        int[][] visited = new int[grid.length][grid.length];
        printTour(grid, x,y,"",visited, 1);

    }
    static int ct = 0;
    static void printTour(int[][] grid, int x, int y, String ans, int[][] visited,int count){

        if(x < 0 || y < 0 || x >= grid.length || y >= grid.length || grid[x][y] > 0){
            return;
        }
        if(count == (grid.length*grid.length)){
            grid[x][y] = count;
//            This will tell all possible knights tour on the (x,y) cell
            System.out.println(ct++);
//            for(int i=0;i<grid.length;i++){
//                for(int j=0;j<grid.length;j++){
//                    System.out.print(grid[i][j] + " ");
//                }
//                System.out.println();
//            }
            grid[x][y] = 0;
            return;
        }

        grid[x][y] = count;
        printTour(grid, x-2,y+1, ans + x + " " + y + "\n",visited,count+1);
        printTour(grid, x-1,y+2, ans + x + " " + y + "\n",visited,count+1);
        printTour(grid, x+1,y+2, ans + x + " " + y + "\n",visited,count+1);
        printTour(grid, x+2,y+1, ans + x + " " + y + "\n",visited,count+1);
        printTour(grid, x+2,y-1, ans + x + " " + y + "\n",visited,count+1);
        printTour(grid, x+1,y-2, ans + x + " " + y + "\n",visited,count+1);
        printTour(grid, x-1,y-2, ans + x + " " + y + "\n",visited,count+1);
        printTour(grid, x-2,y-1, ans + x + " " + y + "\n",visited,count+1);
        grid[x][y] = 0;
    }

}
