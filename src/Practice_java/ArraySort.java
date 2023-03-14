package Practice_java;

import java.util.Scanner;

public class ArraySort {
	public static void swap(int arr[],int a, int b) {
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int partition(int arr[],int l,int h) {
		int pivot=arr[h];
		int i=l-1;
		for(int j=l;j<=h-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
        swap(arr,i + 1, h);
        return (i + 1);
   
	}
	public static void quicksort(int arr[],int l,int h) {
		if(l<=h)
		{
			int parting = partition(arr,l,h);
			quicksort(arr,l,parting-1);
			quicksort(arr,parting+1,h);
		}
		
	}
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter Size");
	    int n=input.nextInt();
	    //array declaration 
	    int arr[] =new int[n];
	    for(int i=0;i<n;i++){
	    	//Enter array elements
	        arr[i]=input.nextInt();
	    }
	    quicksort(arr,0,n-1);
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    	
	    }
	    input.close();
	}
}
