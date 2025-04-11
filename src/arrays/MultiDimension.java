package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {
//         int [][] aar = {
//        		 {5,6,7},
//        		 {6,4,3,6,8,9},
//        		 {6,8,7,6,5}
//         };
//         for(int r = 0;r < aar.length;r++) {
//        	 for(int c = 0;c<aar[r].length;c++) {
//        		 
//        		 System.out.print(aar[r][c]);
//        	 }
//        	 System.out.println("");
//         }
         
         
         Scanner in = new Scanner(System.in);
       
 		int [][] arr1 = new int [3][3];

//         for(int r = 0;r < arr1.length;r++) {
//        	 for(int c = 0;c<arr1[r].length;c++) {
//        		 
//        		 arr1[r][c] = in.nextInt();
//        	 }
//        	 System.out.println("");
//         }
         
//         for(int r = 0;r < arr1.length;r++) {
//        	 for(int c = 0;c<arr1[r].length;c++) {
//        		 
//        		 System.out.print(arr1[r][c]);
//        	 }
//        	 System.out.println("");
//         }
         
         
//         for(int r = 0;r < arr1.length; r++) {
//        	 System.out.println(Arrays.toString(arr1[r]));
//         }
         
         
         for(int[] a :arr1) {
        	 System.out.println(Arrays.toString(a));
         }
         
         String[] ar = new String[5];
         for(int i =0;i<ar.length;i++) {
        	 ar[i] = in.next();
         }
         for(String b : ar) {
        	 
        	 System.out.println(b); 
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	}
}