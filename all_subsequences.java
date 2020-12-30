import java.util.*;
public class Solution
{
    // TC -> N^2
    // SC -> 2^N max size of arraylist
    
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<String> arr = subs(s);
		System.out.println(arr);
	}
	public static ArrayList<String> subs(String s){
	    if(s.length() == 0){
	        ArrayList<String> empty =  new ArrayList<String>();
	        empty.add("");
	        return empty;
	    }
	    String first = Character.toString(s.charAt(0));
	    String rest = s.substring(1);
	    ArrayList<String> resarr = subs(rest);
	    
	    ArrayList<String> finalarr = new ArrayList<String>();
	    for(String str : resarr){
	        finalarr.add(str);
	    }
	    for(String str : resarr){
	        finalarr.add(first + str);
	    }
	    return finalarr;
	}
}
