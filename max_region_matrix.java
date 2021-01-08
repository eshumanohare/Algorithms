import java.io.*;
import java.util.*;

public class Main {
    static int max = 0;
    public static void getMaxGold(int[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && !visited[i][j]) {
                    ArrayList < Integer > bag = new ArrayList < > ();
                    collectGold(arr, i, j, bag, visited, 0,"");
                }
            }
        }
    }

    static void collectGold(int[][] arr, int row, int col, ArrayList < Integer > bag, boolean[][] visited, int gsf, String path) {

        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 0 || visited[row][col]) {
            max = Math.max(max, gsf);
            // System.out.println(path);
            return;
        }

        visited[row][col] = true;
        collectGold(arr, row - 1, col, bag, visited, gsf + arr[row][col],row + " " + col);
        collectGold(arr, row, col - 1, bag, visited, gsf + arr[row][col],row + " " + col);
        collectGold(arr, row + 1, col, bag, visited, gsf + arr[row][col],row + " " + col);
        collectGold(arr, row, col + 1, bag, visited, gsf + arr[row][col],row + " " + col);
        
        visited[row][col] = false;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        getMaxGold(arr);
        System.out.println(max);
    }

}
