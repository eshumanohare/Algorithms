import java.util.*;
public class Solution
{
    
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		subs(s,"");
	}
	public static void subs(String s, String ans){
	   
	    if(s.length() == 0){
	        System.out.println(ans);
	        return;
	    }
	       
	    String first = Character.toString(s.charAt(0));
	    String rest = s.substring(1);
	    
	    subs(rest,ans);
	    subs(rest,ans + first);
	    
	}
}
