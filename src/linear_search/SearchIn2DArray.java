package linear_search;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{4,76,5,34,23,6},
				{2,54,23,12},
				{65,7,32,4},
				{7,54,23,8,5},
		};
		int target = 5;
		System.out.println(Integer.MIN_VALUE);
		
//	    boolean n = serch(arr,target);
//	    System.out.println(n);
		
//	    int[] n =serch1(arr,target);
//	    System.out.println(Arrays.toString(n));
		
		int max  = max(arr,target);
		System.out.println(max);
	}
	static int max(int[][] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		for(int[] intes: arr) {
			for(int element : intes){
				if(element > max) {
					max = element;
				}
			}
		}	
		return max;	
	}
	
	
	static int[] serch1(int[][] arr, int target) {
		if(arr.length == 0) {
			return new int[] { -1,-1};
		}
		for(int row = 0;row < arr.length;row++) {
			for(int col = 0;col < arr[row].length;col++){
				if(arr[row][col]==target) {
					System.out.println(arr[row][col]);
					return new int[] {row,col};
				}
			}
		}	
		return new int[] { -1,-1};	
	}

	static boolean serch(int[][] arr, int target) {
		if(arr.length == 0) {
			return false;
		}
		for(int i = 0;i < arr.length;i++) {
			for(int r = 0;r < arr[i].length;r++){
				if(arr[i][r]==target) {
					System.out.println(arr[i][r]);
					return true;
				}
			}
		}	
	    return false;
	}
}
