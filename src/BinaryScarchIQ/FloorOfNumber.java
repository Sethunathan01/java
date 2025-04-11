package BinaryScarchIQ;

public class FloorOfNumber {

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,9,12,14,17};
		int traget = 986768;
//		int n = floor(arr,traget);
		System.out.println(floor(arr,traget));
	}
	static int floor(int[] arr, int traget) {
//		System.out.println(arr[arr.length-1]);
//		System.out.println(arr.length-1);
		if(traget <= arr[0]) {
			return -1;
		}
		
		int start = 0;
		int end = arr.length-1;
		boolean isAns = arr[start]<arr[end];
		int mid = 0;
		while(start<=end) {
			 mid = start+(end-start)/2;
				if(traget == arr[mid]) {
					return arr[mid];
				}
			if(isAns) {
				if(traget<arr[mid]) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}else {
				if(traget>arr[mid]) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}
		}
		return arr[end];

	}


}
