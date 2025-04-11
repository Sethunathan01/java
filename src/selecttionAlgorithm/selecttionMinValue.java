package selecttionAlgorithm;

import java.util.Arrays;

public class selecttionMinValue {

	public static void main(String[] args) {
		int[] arr = {9,8,6,8,9,6,4,5,7};
		selecttion(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selecttion(int[] arr) {      
		for(int i =0;i<arr.length;i++) {
			int last = arr.length-1; 
			int minIndex = getMinIndex(arr,i,last);
			swap(arr,minIndex,i);
		}
	}
	 static int getMinIndex(int[] arr, int start, int end) {
		 int min = start;
		 for(int i =min;i<=end;i++) {
			 if(arr[min]>arr[i]) {
				 min= i;
			 }
		 }
		return min;
	}
	 static void swap(int[] arr, int first,int secound) {
			int temp = arr[first];
			arr[first] = arr[secound];
			arr[secound] = temp;
	 }
}
