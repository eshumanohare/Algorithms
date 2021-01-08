import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        boolean[] visited = new boolean[n];
        boolean[] normalDiag = new boolean[2 * n - 1];
        boolean[] otherDiag = new boolean[2 * n - 1];
        printNQueens(chess, "", 0, visited, normalDiag, otherDiag);
    }

    public static void printNQueens(int[][] chess, String qsf, int row, boolean[] visited, boolean[] normal, boolean[] other) {

        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for (int i = 0; i < chess[0].length; i++) {
            int normalDiag = row + i;
            int otherDiag = row - i + chess.length - 1;
            if (!visited[i] && !normal[normalDiag] && !other[otherDiag]) {
                visited[i] = true;
                normal[normalDiag] = true;
                other[otherDiag] = true;
                chess[row][i] = 1;
                printNQueens(chess, qsf + row + "-" + i + ", ", row + 1, visited, normal, other);
                chess[row][i] = 0;
                visited[i] = false;
                normal[normalDiag] = false;
                other[otherDiag] = false;
            }
        }
    }
}
