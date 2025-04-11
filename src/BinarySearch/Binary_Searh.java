package BinarySearch;

import java.util.Arrays;

public class Binary_Searh {

	public static void main(String[] args) {
//		int[] arr = {-5,-3,0,1,2,3,9,5,6,7,8,9,};
		int[] arr = {9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,-5,-6,-7};
		int traget =-7; 
		int n =  BinarySearch1(arr,traget);
//		int n =  BinarySearch(arr,traget);
		System.out.println(arr[n]);
		System.out.println(n);
	}

	static int BinarySearch1(int[] arr, int traget) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(traget > arr[mid]) {
				end = mid-1;
			}else if(traget < arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
//			System.out.println(arr[mid]);

		}
		return -1;
	}
	
	
	
	static int BinarySearch(int[] arr, int traget) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(traget < arr[mid]) {
				end = mid-1;
			}else if(traget > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
			System.out.println(mid);

		}
		return -1;
	}

}
