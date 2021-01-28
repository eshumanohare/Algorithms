import java.util.*;
import java.io.*;

public class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String[] array = buffer.readLine().split(" ");
	    int k = Integer.parseInt(buffer.readLine());
	    int[] arr = new int[array.length];
	    for(int i=0; i<array.length; i++){
	        arr[i] = Integer.parseInt(array[i]);
	    }
	    
	    int index = quickSort(arr,0,arr.length-1,k-1);
	    
	    System.out.println(index);
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i] + " ");
	    }
	}
	
	static int quickSort(int[] array, int low, int high, int k){
	    
	   // Taking last element as the pivot always because why not?
	    int pivot = array[high];
	    int pivotIndexInSortedArray = partition(array,low,high,pivot);
	   // System.out.println(pivot + " " + pivotIndexInSortedArray);
	   if(k < pivotIndexInSortedArray){
	    int ans = quickSort(array,low,pivotIndexInSortedArray-1,k);
	    return ans;
	   }
	   else if(k > pivotIndexInSortedArray){
	    int ans = quickSort(array,pivotIndexInSortedArray+1,high,k);
	    return ans;
	   }
	       return array[pivotIndexInSortedArray];
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
