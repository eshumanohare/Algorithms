import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String str, String pattern, HashMap < Character, String > map, String op) {
        
        if(pattern.length() == 0){
            if(str.length() == 0){
            HashSet<String> uniqueString = new HashSet<>();
            for(int i=0;i<op.length();i++){
                String pat = map.get(op.charAt(i));
                if(!uniqueString.contains(pat)){
                    System.out.print(op.charAt(i) + " -> " + pat+ ", ");
                    uniqueString.add(pat);
                } 
            }
            System.out.println(".");
            }
            return;
        }
        char first = pattern.charAt(0);
        String ros = pattern.substring(1);
        if(map.containsKey(first)){
            String lastPattern = map.get(first);
            if(str.length() >= lastPattern.length()){
                String left = str.substring(0,lastPattern.length());
                String right = str.substring(lastPattern.length());
                if(left.equals(lastPattern)){
                    solution(right,ros,map,op);
                }
            }
        }
        else{
            for(int i=1;i<str.length();i++){
                String prefix = str.substring(0,i);
                map.put(first,prefix);
                solution(str.substring(i),ros,map,op);
                map.remove(first);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String pattern = scn.next();
        HashMap < Character, String > map = new HashMap < > ();
        solution(str, pattern, map, pattern);
    }
}
