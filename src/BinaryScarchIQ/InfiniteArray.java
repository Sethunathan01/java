package BinaryScarchIQ;

public class InfiniteArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int target =18;
		int n = ans(arr,target);
		System.out.println(n);
	}
	static int ans(int[] arr,int target) {
		//first find the rang
		//fist start with a box of size 2
		int start = 0;
		int end = 1;
		//condition for the to line in the range
		while(target > arr[end]) {
				int temp = end+1;//this is my new start
				//double the box value
				//end = previous end +sizeof box * 2;
				end = end + (end - start+1)*2;
				start = temp;	
		}
		return BinarySearch(arr,target,start,end);
		
	}
	static int BinarySearch(int[] arr, int target,int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid] > target) {
				end = mid-1;
			}else if(arr[mid] < target) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return -7;
	}

}
