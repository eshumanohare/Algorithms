import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    static int ans = 0;
    static String finalseq = "";
	public static void main(String[] args) throws Exception{
	    
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String[] scores = buffer.readLine().split(" ");
	    String[] wait = buffer.readLine().split(" ");
	    int[] dp = new int[scores.length];
	    System.out.println(findAns(scores, wait, scores.length,0,dp));
	    for(int i : dp){
	        System.out.print(i + " ");
	    }
	}
	
	static int findAns(String[] scores, String[] wait, int n, int index, int[] dp){
	    
	    if(index >= n){
	        return 0;
	    }
	    if(dp[index] != 0){
	        return dp[index];
	    }
	    int score1 = findAns(scores, wait, n,index+1,dp);
	    int score2 = findAns(scores,wait,n,index + Integer.parseInt(wait[index])+1,dp) + Integer.parseInt(scores[index]);
	    dp[index] = Math.max(score1,score2);
	    return dp[index];
	}
	
	
}
