package selecttionAlgorithm;

import java.util.Arrays;

public class selecttionMaxValue {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,-1};
		selecttion(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selecttion(int[] arr) {      
		for(int i =0;i<arr.length;i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
			
		}
	}
	
	 static int getMaxIndex(int[] arr, int start, int end) {
		 int max = start;
		 for(int i =0;i<=end;i++) {
			 if(arr[max]<arr[i]) {
				 max= i;
			 }
		 }
		return max;
	}
	 static void swap(int[] arr, int first,int secound) {
			int temp = arr[first];
			arr[first] = arr[secound];
			arr[secound] = temp;
	 }

}
