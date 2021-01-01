import java.util.*;
public class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int stairs = sc.nextInt();
		printJumps(stairs,"");
	}
	public static void printJumps(int stairs, String ans){
	    if(stairs == 0){
	        System.out.println(ans);
	        return;
	    }
	    if(stairs < 0)
	        return;
	        
	    printJumps(stairs-1, ans + "1");
	    printJumps(stairs-2, ans + "2");
	    printJumps(stairs-3, ans + "3");
	}
}
