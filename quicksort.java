import java.util.*;
import java.io.*;

public class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String[] array = buffer.readLine().split(" ");
	    int[] arr = new int[array.length];
	    for(int i=0; i<array.length; i++){
	        arr[i] = Integer.parseInt(array[i]);
	    }
	    
	    quickSort(arr,0,arr.length-1);
	    
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i] + " ");
	    }
	}
	
	static void quickSort(int[] array, int low, int high){
	    if(low >= high){
	        return;
	    }
	    
	   // Taking last element as the pivot always because why not?
	    int pivot = array[high];
	    int pivotIndexInSortedArray = partition(array,low,high,pivot);
	    quickSort(array,low,pivotIndexInSortedArray-1);
	    quickSort(array,pivotIndexInSortedArray+1,high);
	}
	
	static int partition(int[] array, int low, int high, int pivot){
	    int i=0;
	    int j=0;
	    while(i < array.length){
	        if(array[i] > pivot){
	            i++;
	        }
	        else{
	            swap(array,i,j);
	            i++;
	            j++;
	        }
	    }
	    return j-1;
	}
	
	static void swap(int[] array, int a, int b){
	    int c = array[a];
	    array[a] = array[b];
	    array[b] = c;
	}
}
