package arrays;

import java.util.Arrays;

public class Max {

	public static void main(String[] args) {
		int[] arr = {2,3,7,95,87,9,30,24,6,1,1,1};
//		 int maxm = arr[0];

//        for(int i =1;i<arr.length;i++) {
//        	if(arr[i] < maxm) {
//        		 maxm = arr[i];
//        	}
//        }
//		System.out.println(maxm);

//		max(arr);
//		System.out.println(max(arr));
		
		
		
//		maxRange(arr,7,2);
//		System.out.println(maxRange(arr,8,2));
//		maxRange( arr, 4, 3);
		reverseArr(arr);
		
	}
//	int[] arr = {2,3,7,95,30,24,6};

	 static void max(int[] arr1) {
		 int maxm = arr1[0];
		 
		 for(int i = 1;i<arr1.length;i++) {

			 if(arr1[i]>maxm) {
				 maxm = arr1[i];//
	         }
//			 System.out.println(maxm);
		 }
		 
		 System.out.println(maxm);
//		return maxm;        
	}
	 
	 
	 
	 static void maxRange(int[] arr1,  int start, int end) {
		 
		 int maxm = arr1[start];
		 
		 for(int i = start;i > end;i++) {

			 if(arr1[i] < maxm) {
				 maxm = arr1[i];
	         } 
		 }
		 
		 
//		 if(arr1[start] < arr1[end]) { 
//			 maxm = arr1[end];
//		}
		 
		 
		 System.out.println(maxm);
//		return maxm;        
	}  
	 
	 static void reverseArr(int[] arr1) {
		  int start = 0;
		  int end = arr1.length-1;	 
		  while(start < end){
			  swap(arr1, start,end);				
			   start++;
			   end--;  
		  }
		  System.out.println(Arrays.toString(arr1));

	 }
	 static void swap(int[] arr1 ,int start, int end) {
		 int dup = arr1[start];
		  arr1[start] = arr1[end];
		  arr1[end] = dup;  
	}
	 
	 
	 
	 
	 

}
