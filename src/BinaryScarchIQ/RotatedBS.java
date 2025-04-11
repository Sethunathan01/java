package BinaryScarchIQ;

public class RotatedBS {

	public static void main(String[] args) {
		int[] arr = {6,7,8,8,8,8,8,8,9,9,1,2,2,2,2,3,4,5};
//		int n = findPivet(arr);
		int target = 8;
		int n = search(arr,target);
		
		System.out.println(n);
	}
	
	
	static int search(int[] nums, int target) {
		int pivot = findPivet(nums);
		// if you did not find a pivot, it means the array is not rotated
		if(pivot == -1) {
			return binarySearch(nums, target,0,nums.length-1);
		}
		// if pivot do normal binary search
		if(nums[pivot] == target) {
			return pivot;
		}
		if(target >= nums[0]) {
			return binarySearch(nums, target,0,pivot-1);
		}
		return binarySearch(nums, target,pivot+1,nums.length-1);
	}
	
	
	static int binarySearch(int[] arr, int traget,int start, int end) {
	while(start <= end) {
		int mid = (start + end)/2;
		if(traget < arr[mid]) {
			end = mid-1;
		}else if(traget > arr[mid]) {
			start = mid+1;
		}else {
			return mid;
		}
//		System.out.println(mid);

	}
	return -1;
}
	
	static int findPivet(int[] arr) {
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
			if(arr[mid] <= arr[start]) {
				end = mid-1;
			}else {
				start = mid +1; 
			}
//			return arr[mid];
		}
		return -1;
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
