package Practice_java;

import java.util.*;

public class ArrayListSearch {
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter Size");
	    int n=input.nextInt();
	    //Arraylist declaration 
	    ArrayList<Integer>arr=new ArrayList<>(n);
	    for(int i=0;i<n;i++){
	    	//Enter array elements
	        int element=input.nextInt();
	        arr.add(i,element);
	    }
	    int key=input.nextInt();	
	    System.out.print(binarySearch(arr,0,arr.size()-1,key)==1?"Found":"Not Found");
	   //mergeSort(arr,0,arr.size()-1);
   	System.out.print("hi");
	   
	    for(int h=0;h<n;h++) {
	    	System.out.print(arr.get(h));
    }
//	    input.close();
	}
	public static void mergeSort(ArrayList<Integer>arr,int l, int h) {
        if (l<h&& (h-l)>= 1) {
            int mid = (l + h) / 2;
            mergeSort(arr,l, mid);
            mergeSort(arr,mid+ 1,h);
            merge(arr,l, mid,h);
        }
    }
    public static void merge(ArrayList<Integer>arr,int l , int mid, int h) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        int getLeftIndex = l;
        int getRightIndex = mid + 1;
        //System.out.println("NOW"+getLeftIndex+ " "+ mid +" "+ getRightIndex);
        while (getLeftIndex <= mid && getRightIndex <= h) {
        System.out.println("INSIDE "+l+h+"---"+getLeftIndex+ " "+ mid +" "+ getRightIndex);
            if (arr.get(getLeftIndex) <= arr.get(getRightIndex)) {
                tempArray.add(arr.get(getLeftIndex));
                getLeftIndex++;
            } 
            else {
                tempArray.add(arr.get(getRightIndex));
                getRightIndex++;

            }
        }
        while (getLeftIndex <= mid) {
        System.out.println("left"+getLeftIndex+ " "+ mid +" "+ getRightIndex);
            tempArray.add(arr.get(getLeftIndex));
            getLeftIndex++;
        }
        while (getRightIndex <= h) {
        System.out.println("right"+getLeftIndex+ " "+ mid +" "+ getRightIndex);
            tempArray.add(arr.get(getRightIndex));
            getRightIndex++;
        }
        arr.clear();
        for (int i = 0; i < tempArray.size(); i++) {
            arr.add(tempArray.get(i));

        }

    }

	public static int binarySearch(ArrayList<Integer> arr, int l, int h, int key) {
		int mid=(l+h)/2;
		//Collections.sort(arr);
		mergeSort(arr,l,h);
		while(l<=h) {
			if(arr.get(mid)==key) {
				return 1;
			}
			else if(arr.get(mid)>key) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
			 mid=(l+h)/2;
		}
		return -1;
	}
}
