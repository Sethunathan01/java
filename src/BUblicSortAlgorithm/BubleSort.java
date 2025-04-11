package BUblicSortAlgorithm;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] arr = {2,5,6,3,2,1,8};
		buble(arr);
		System.out.println(Arrays.toString(arr));	
	}  
	public  static void buble(int[] arr) { 
		for(int i =0;i<arr.length;i++) {
			//foe each steps,max item will come at the last resp index
			for(int j = 1;j<arr.length-i;j++) {
				//swap if the item is sample then provious item	
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					System.out.println(Arrays.toString(arr));	

				}
				
				System.out.println(Arrays.toString(arr)+"Sethu");	


			}
		}
	}
}
