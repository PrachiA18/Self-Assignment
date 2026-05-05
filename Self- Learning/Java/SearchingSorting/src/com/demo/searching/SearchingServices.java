package com.demo.searching;

public class SearchingServices {
  
	
	public static int sequentialSearch(int []arr,int searchnum) {
		
		for(int i=0 ;i< arr.length;i++) {
			if (searchnum== arr[i]) {
				return i;
			}
		}
		return-1;
	}
	
	public static int binarySearchNonRecursive(int[]arr,int searchnum) {
		  int low=0;
		  int high =arr.length-1;
		  int cnt =0;
		  while(low<=high) {
			  int mid=(low+high)/2;
			  
			  System.out.println("number of comparisons:"+cnt);
			  return-1;
		  }
		  public static int binarySearchRecursive(int[]arr,int searchnum,int low,int high) {
			  System.out.println("binary search called low:"+low+ "High"+high);
			  if(low<=high) {
				  int mid =(low+high)/2;
				  if(arr[mid]==searchnum) {
					  return mid;
				  }
				  else if(searchnum<arr[mid]) {
					  return binarySearchRecursive(arr,searchnum,low,mid-1);
				  
				  }else {
					  return binarySearchRecursive(arr,searchnum,mid+1,high);
				  }
			  }
			 return -1; 
		  }
	}
}
