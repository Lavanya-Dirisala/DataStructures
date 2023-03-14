package Practice_java;
import java.util.*;

public class ArraySearch {
	//Linearsearching
	public static boolean linearSearch(int n,int arr[] ,int key){
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                flag=true;
            }
        }
        return flag;
    }
	//BinarySearching
    public static int binarySearching(int n,int arr[],int key){
        Arrays.sort(arr);
        int first=0;
        int last=n-1;
        int mid = (first + last)/2;
        while(first<=last){
            if(arr[mid]==key){return 1;}
            else if(arr[mid]<key){first=mid+1;}
            else last=mid-1;
            mid=(first+last)/2;
        }
        return -1;
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
	    System.out.print("Enter element to search ");
	    int k=input.nextInt();
	    String result= linearSearch(n,arr,k)==true?"Element found" : "Element Not Found";
	    System.out.println("LINEAR SEARCH "+result);
	    String result1=binarySearching(n,arr,k)==1?"Element Found":"Element Not found";
	    System.out.println("BINARY SEARCH " + result1);
	    input.close();
	}
}
