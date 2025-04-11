package BinaryScarchIQ;

public class SearchInMountain {

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,3,4,5,6,7,6,5,4,3,2,0};
		int  target = -1;
		
		System.out.println(search(arr,target));
		
	}
	static int search(int[] arr, int target) {
		 int peak = peakIndexInMountainAray(arr);
		 int firstTry = orderAgnostincbinarySearch(arr,target,0,peak);
		 if(firstTry != -1) {
//			 return orderAgnostincbinarySearch(arr,target,0,peak);
			 return firstTry;
		 }
		 //try tosearch in second half
		return orderAgnostincbinarySearch(arr,target,peak+1,arr.length-1);
	}
	static int peakIndexInMountainAray(int[] arr) {
		int start = 0; 
		int end = arr.length-1;
		while(start<end) {
			int mid = start +(end - start)/2;
            // your in dic part of array
			// this may be the ans, but look at left
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else{
				//you are in asc part of array
 				start = mid+1;//because we know mid +1 element > mid element 
			}
		}
		return start;
	}
	static int orderAgnostincbinarySearch(int[] arr, int target, int start, int end) {
//		int start = 0;
//		int end = arr.length-1;
		boolean isAns = (arr[start]<arr[end]);
		
		while(start<=end) {
			int mid = start+(end - start)/2;
			if(target == arr[mid]) {
				return mid;
			}
			if(isAns) {
				if(target <arr[mid]) {
					end = mid-1;
				}else {
					start = mid +1;
				}
			}else {
				if(target >arr[mid]) {
					end = mid-1;
				}else {
					start = mid +1;
				}
			}
		}
		return -1;
	}

//	static int binarySearch(int[] arr, int traget,int start, int end) {
//		while(start <= end) {
//			int mid = (start + end)/2;
//			if(traget < arr[mid]) {
//				end = mid-1;
//			}else if(traget > arr[mid]) {
//				start = mid+1;
//			}else {
//				return mid;
//			}
//			System.out.println(mid);
//
//		}
//		return -1;
//	}
}
