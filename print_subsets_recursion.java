import java.util.*;
import java.io.*;

public class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buffer.readLine());
		String[] arr = buffer.readLine().split(" ");
		int sum = Integer.parseInt(buffer.readLine());
		printSubsets(arr,n,sum,0,0,"");
		
	}
	
	static void printSubsets(String[] arr, int n, int sum, int index, int ssof, String ans){
	   
	    if(ssof == sum){
	        System.out.println(ans);
	        return;
	    }
	    if(index == n){
	        return;
	    }
	    
	    printSubsets(arr,n,sum,index+1,ssof, ans);
	    printSubsets(arr,n,sum,index+1,ssof + Integer.parseInt(arr[index]), ans + arr[index] + " ");
	}
}
