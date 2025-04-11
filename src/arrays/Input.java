package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	private static int[] srr;

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 425; 
        arr[2] = 645;
        arr[3] = 67564;
        arr[4] = 325;
        System.out.println(Arrays.toString(arr));
        
      
//        System.out.println(arr[3]);
//        for(int i = 0;i <arr[3];i++) {        //67
//        	int a = arr[3] % 10;              //7
//        	System.out.println(a);
//        	arr[3] =arr[3] / 10;              //6
////        	System.out.println(arr[3]);
//        }
        
        
        
//        for(int i =0;i<arr.length;i++) {
//        	arr[i] =in.nextInt(); 
//        }
//        for(int i =0;i<arr.length;i++) {
//        	 System.out.println(arr[i]);
//        }
        
        
//        for(int j :arr) {//for every element in, array print the element
//       	 System.out.println(j);//hear num represents element of the array
//        }
        
//        System.out.println(arr[5]);//index out of bount error
        
        
        String[] str = new String [5];
        for (int i = 0; i<str.length;i++) {   
        	str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        
	}

}
