import java.util.*;
public class Solution
{
    // TC -> N^2
    // SC -> O(product of all number of chars in all numbers < 10000)
    
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		ArrayList<String> arr = subs(number);
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
	    if(s.charAt(0) == '1'){
	        //abc
        for(String str : resarr){
            finalarr.add("a" + str);
            finalarr.add("b" + str);
            finalarr.add("c" + str);
        }
	    }
	    
	    if(s.charAt(0) == '2'){
	        //def
        for(String str : resarr){
            finalarr.add("d" + str);
            finalarr.add("e" + str);
            finalarr.add("f" + str);
        }
	    }
	    if(s.charAt(0) == '3'){
	        //ghi
        for(String str : resarr){
            finalarr.add("g" + str);
            finalarr.add("h" + str);
            finalarr.add("i" + str);
        }
	    }
	    if(s.charAt(0) == '4'){
	        //jkl
        for(String str : resarr){
            finalarr.add("j" + str);
            finalarr.add("k" + str);
            finalarr.add("l" + str);
        }
	    }
	    if(s.charAt(0) == '5'){
	        //mnop
        for(String str : resarr){
            finalarr.add("m" + str);
            finalarr.add("n" + str);
            finalarr.add("o" + str);
            finalarr.add("p" + str);
        }
	    }
	    if(s.charAt(0) == '6'){
	        //qrst
        for(String str : resarr){
            finalarr.add("q" + str);
            finalarr.add("r" + str);
            finalarr.add("s" + str);
            finalarr.add("t" + str);
        }
	    }
	    if(s.charAt(0) == '7'){
	        //uv
        for(String str : resarr){
            finalarr.add("u" + str);
            finalarr.add("v" + str);
        }
	    }
	    if(s.charAt(0) == '8'){
	        //wxyz
        for(String str : resarr){
            finalarr.add("w" + str);
            finalarr.add("x" + str);
            finalarr.add("y" + str);
            finalarr.add("z" + str);
        }
	    }
	    if(s.charAt(0) == '9'){
	        //mnop
        for(String str : resarr){
            finalarr.add("." + str);
            finalarr.add(";" + str);
        }
	    }
	    if(s.charAt(0) == '0'){
	        //mnop
        for(String str : resarr){
            finalarr.add("?" + str);
            finalarr.add("!" + str);
        }
	    }
	    return finalarr;
	}
}
