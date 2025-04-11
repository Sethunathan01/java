package BinarySearch;

public class OrderAgnostincBS {

	public static void main(String[] args) {
//		int[] arr = {-2,-1,0,1,2,3,4,5,6,7,8,9,10};
		int[] arr = {10,8,7,6,5,4,3,2,1,0,-1,-2};
		int target = 2;
		int n = binarySearch(arr,target);
		System.out.println(n);
	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
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
		return -11;
	}

}
