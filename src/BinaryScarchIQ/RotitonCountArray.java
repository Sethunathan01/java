package BinaryScarchIQ;

public class RotitonCountArray {
    public static void main(String[] ar) {
    	int[] arr = {0};
    	int n =rotitonCount(arr);
    	System.out.println(n);
    }
	static int rotitonCount(int[] arr) {
		int pivot = findPivetWidthDuplicates(arr); 
		if(arr.length-1 == pivot) {
			return 0;
		}
		return pivot+1;
//		int start = 0;
//		int end =arr.length-1;
//		while(start<end) {
//			int mid = start+(end -start)/2;
//			if(mid <end && arr[mid]>arr[mid+1]) {
//				return mid;
//			}
//			if(mid >start && arr[mid] < arr[mid-1]) {
//				return mid;
//			}
//			if(arr[mid]<=arr[start]) {
//				end = mid-1;
//			}else {
//				start = mid+1;
//			}
//		}
//		return -1;
	}
	
	 static int findPivetWidthDuplicates(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int mid = start +(end - start)/2;
            // 4 case over hear
			if(mid < end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid]<arr[mid-1]){
				//you are in asc part of array
				return mid-1;//because we know mid +1 element > mid element 
			}
//			if(arr[mid] <= arr[start]) {
//				end = mid-1;
//			}else {
//				start = mid +1; 
//			}
			
			// if element at middel,start end are eqal then skip the duplicates
			if(arr[mid] == arr[end] && arr[mid] == arr[start]) {
				// skip the duplicates
				
				// NOTE: what if this elements at start and end wher the pivots??
				// check if start is pivot
				if(arr[start] > arr[start +1]) { 
					return start;
				}
				start++;
				if(arr[end] < arr[end -1]) { 
					return end-1;
                }
				end--;
			}
			
			// left side sorted, so pivet should be in right
			else if(arr[start]<arr[mid]|| (arr[start] == arr[mid] && arr[mid] >arr[end])) {
				return mid +1;
			}else {
				return mid -1;
			}
		}
		return -1;
	}

}
