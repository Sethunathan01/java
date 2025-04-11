package BinaryScarchIQ.MyDemo;

public class MounttainArrayFindTargetIndex {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,12,13,11,9,7,4,0};
		int target = 1;
		int n = peakIndex(arr,target);
		System.out.println(n);
	}

	
	static int peakIndex(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int mid = start +(end - start)/2;
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return binarySearch(arr,target,start);
	}

	static int binarySearch(int[] arr, int target,int mounttainPeakIndex) {
	    int start = 0;
	    int peakIndex = mounttainPeakIndex;
	    int end = arr.length-1;
	    while(arr[peakIndex] > start) {
	    	int mid = start + (peakIndex - start)/2; 
	    	if(target < arr[mid]) {
	    		end = mid-1;
	    	}else if(target > arr[mid]) {
	    		start = mid+1;
	    	}else {
	    		return mid;
	    	}	
	    }
	    while(arr[peakIndex] > end) {
	    	int mid = peakIndex +(end -peakIndex)/2; 
	    	if(target > arr[mid]){
	    		end = mid-1;
	    	}else if(target < arr[mid]) {
	    		start = mid+1;
	    	}else {
	    		return mid;
	    	}	
	    }
		return -1;
	}
}
