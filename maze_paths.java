import java.util.*;
import java.io.*;

public class Solution
{
	public static void main(String args[]) throws Exception
	{
    	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    int row = Integer.parseInt(buffer.readLine());
	    int col = Integer.parseInt(buffer.readLine());
	    HashMap<String, ArrayList<String>> map = new HashMap<>();
	    ArrayList<String> array = paths(row,col,0,0,map);
	    System.out.println(array);
	}
	
	static ArrayList<String> paths(int totalRows, int totalCols, int rows, int cols, HashMap<String, ArrayList<String>> map){
	    String path = "" + rows + " " + cols;
	    if(map.containsKey(path)){
	        return map.get(path);
	    }
	    
	    if(rows == (totalRows - 1) && cols == (totalCols - 1)){
	        ArrayList<String> temp =  new ArrayList<String>();
	        temp.add("");
	        return temp;
	    }
	    
	    if(cols == (totalCols - 1)){
	        ArrayList<String> arr = new ArrayList<>();
	        String s = "";
	        for(int i=rows;i<totalRows-1;i++){
	            s += "V";
	        }
	        arr.add(s);
	        return arr;
	    }
	    if(rows == (totalRows - 1)){
	        ArrayList<String> arr = new ArrayList<>();
	        String s = "";
	        for(int i=cols;i<totalCols-1;i++){
	            s += "H";
	        }
	        arr.add(s);
	        return arr;
	    }
	    
	    ArrayList<String> hpaths = paths(totalRows, totalCols, rows,cols+1, map);
	    ArrayList<String> vpaths = paths(totalRows, totalCols, rows+1, cols, map);
	    
	    ArrayList<String> finalarr = new ArrayList<String>();
	    for(String p : hpaths){
	        finalarr.add("H" + p);
	    }
	    for(String p : vpaths){
	        finalarr.add("V" + p);
	    }
	    map.put(path, finalarr);
	    return finalarr;
	}
}
