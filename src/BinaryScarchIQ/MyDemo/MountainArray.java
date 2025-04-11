package BinaryScarchIQ.MyDemo;

public class MountainArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1};
		System.out.println("Sethu");
		
		System.out.println(binarySearch(arr));
	}

	static int binarySearch(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int mid = start +(end -start)/2;
		while(start <= end) {
			if(arr[start] == arr[end]) {
				return end;
			}
			if(arr[start] < arr[end]) {
				start = mid;
			}else{
				end = mid;
			}
		}
		return -1;
	}

}
