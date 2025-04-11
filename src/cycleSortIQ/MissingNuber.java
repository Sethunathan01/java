package cycleSortIQ;

import java.util.Arrays;

public class MissingNuber{

	public static void main(String[] args) {
		int[] arr = {4,5,8,6,1,2};
		int n = missingNuber(arr);
		System.out.println(n);
	}

	private static int missingNuber(int[] arr) {
		int start = 0;
  		while(start<arr.length) {
  			System.out.println(Arrays.toString(arr));

			if(arr[start] < arr.length && arr[start] != start) {
				swap(arr,start,arr[start]);
			}else {
				start++;
			}
		}
  		for(int index = 0; index <arr.length;index++) {
  			if(arr[index] !=index) {
  				return index;
  			}
  		}
  		return arr.length;
	} 

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
