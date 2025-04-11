package BinaryScarchIQ;

public class CeilingOfNumber {

	public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,9,23,54,444};
        int traget = 444;
        int n = ceiling(arr,traget);
        System.out.println(n);
	}
	//return the index of samlld no >= traget
	static int ceiling(int[] arr, int traget) {
		if(traget >arr[arr.length-1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length-1;
		boolean isAns = arr[start]<arr[end];
		while(start<=end) {
			int mid = start+(end-start)/2;
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
		return arr[start];

	}

 
}
