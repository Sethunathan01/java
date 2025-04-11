package cycleSortIQ;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {
		int[] arr = {3,5,1,2,4};
		cyclesort(arr);

	}

	private static void cyclesort(int[] arr) {
		int start = 0;
  		while(start<arr.length) {
//  			System.out.println(Arrays.toString(arr));
			if(arr[start]-1==start) {
				start++;
			}else {
				swap(arr,start,arr[start]-1);
			}

		}
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
