package BinarySearchIn2DArrays;

import java.util.Arrays;

public class RowColMatrix {
	public static void main(String[] args) {
		 RowColMatrix f = new  RowColMatrix();
		int[][] arr = {
				{12},
				{23,43,23},
				{65,43,76,65},
				{21,32,54,65,47}
		};
		int target = 76;
		
		
		int[] n = search(arr,target);
		System.out.println( Arrays.toString(n));
	}
	static int[] search(int[][] arr,int target) {
	
		for(int r =0;r < arr.length;r++) {
			for(int c = 0;c<arr[r].length;c++ ) {
				if(target == arr[r][c]) {
					int[] n = new int[] {r,c}; 
					 return n;
				}
			}
		}
		return  new int[]{-1,-1};
	}
	

}
