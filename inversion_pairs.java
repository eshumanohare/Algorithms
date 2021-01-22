import java.util.*;
import java.io.*;

public class Solution
{
    static int numberIP = 0;
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String[] arr = buffer.readLine().split(" ");
	    int[] unsortedarr = new int[arr.length];
	    
	    for(int i=0; i<arr.length; i++){
	        unsortedarr[i] = Integer.parseInt(arr[i]);
	    }
	    
	    int[] sortedarr = mergesort(unsortedarr,0,unsortedarr.length-1);
	    
	    for(int i=0;i<sortedarr.length; i++){
	        System.out.print(sortedarr[i] + " ");
	    }
	    System.out.println("\n" + numberIP);
	}
	
	static int[] mergesort(int[] unsortedarr, int low, int high){
	    if(low == high){
	        int[] singleelemarr = new int[1];
	        singleelemarr[0] = unsortedarr[low];
	        return singleelemarr;
	    }
	    
	    int middle = low + (high - low)/2;
	    int[] lefthalf = mergesort(unsortedarr, low, middle);
	    int[] righthalf = mergesort(unsortedarr, middle+1, high);
	    int[] sortedarr = mergearr(lefthalf, righthalf);
	    return sortedarr;
	} 
	
	static int[] mergearr(int[] leftarr, int[] rightarr){
	    int i=0;
	    int j=0;
	    int k=0;
	    
	    int[] sortedarr = new int[leftarr.length + rightarr.length];
	    
	    while(i < leftarr.length && j < rightarr.length){
	        if(leftarr[i] < rightarr[j]){
	            sortedarr[k] = leftarr[i];
	            i++;
	        } else {
	            sortedarr[k] = rightarr[j];
	            if(leftarr[i] != rightarr[j]){
	               // System.out.println(leftarr[i] + " " + rightarr[j]);
	                numberIP += leftarr.length - i;
	            }
	            j++;
	        }
	        k++;
	    }
	    
	    while(i < leftarr.length){
	        sortedarr[k] = leftarr[i];
	        i++;
	        k++;
	    }
	    
	    while(j < rightarr.length){
	        sortedarr[k] = rightarr[j];
	        j++;
	        k++;
	        
	    }
	    return sortedarr;
	}
}
