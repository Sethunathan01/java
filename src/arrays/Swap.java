package arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
        int[] arr = {1,4,2,5,7};
        System.out.println(Arrays.toString(arr));
//		 int temp = arr[0];
//		 arr[0] = arr[1];
//		 arr[1] = temp;

        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
	}

	 static void swap(int[] arr1, int index1, int index2) {
		 int temp = arr1[index1];
		 arr1[index1] = arr1[index2];
		 arr1[index2] = temp;
	}

}
