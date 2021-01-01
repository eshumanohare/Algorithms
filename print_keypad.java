import java.util.*;
public class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		subs(number, "");
	}
	public static void subs(String s, String ans){
	    if(s.length() == 0){
	        System.out.println(ans);
	        return;
	    }
	    String first = Character.toString(s.charAt(0));
	    String rest = s.substring(1);
	    
	    if(s.charAt(0) == '1'){
	        //abc
	        subs(rest, ans + "a");
	        subs(rest, ans + "b");
	        subs(rest, ans + "c");
	    }
	    
	    if(s.charAt(0) == '2'){
	        //def
	        subs(rest, ans + "d");
	        subs(rest, ans + "e");
	        subs(rest, ans + "f");
	    }
	    if(s.charAt(0) == '3'){
	        //ghi
	        subs(rest, ans + "g");
	        subs(rest, ans + "h");
	        subs(rest, ans + "i");
	    }
	    if(s.charAt(0) == '4'){
	        //jkl
	        subs(rest, ans + "j");
	        subs(rest, ans + "k");
	        subs(rest, ans + "l");
	    }
	    if(s.charAt(0) == '5'){
	        //mnop
	        subs(rest, ans + "m");
	        subs(rest, ans + "n");
	        subs(rest, ans + "o");
	        subs(rest, ans + "p");
	    }
	    if(s.charAt(0) == '6'){
	        //qrst
	        subs(rest, ans + "q");
	        subs(rest, ans + "r");
	        subs(rest, ans + "s");
	        subs(rest, ans + "t");
	    }
	    if(s.charAt(0) == '7'){
	        //uv
	        subs(rest, ans + "u");
	        subs(rest, ans + "v");
	    }
	    if(s.charAt(0) == '8'){
	        //wxyz
	        subs(rest, ans + "w");
	        subs(rest, ans + "x");
	        subs(rest, ans + "y");
	        subs(rest, ans + "z");
	    }
	    if(s.charAt(0) == '9'){
	        subs(rest, ans + ".");
	        subs(rest, ans + ";");
	    }
	    if(s.charAt(0) == '0'){
	        subs(rest, ans + "?");
	        subs(rest, ans + "!");
	    }
	}
}
