//package arrays;
//public class Demo{
//
////	public static void main(String[] ar) {
////		Demo ar1 = new Demo();
////		int[] ros;
////		  ros = new int[3];
////		    System.out.println(ros[1]);
//
////	ar1.
//	  
//	
////	}
//	public static void main(String[] ar) {
//	    System.out.println("Sethunathan2001");
//
//	}
//	
//}
package arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {     
    	
//
//	        for(int j = 0;j<5;j++) {
//	        	for(int s = j;s<5;s++) {
//			    	System.out.print(" ");
//	        	}
//		        	int i = j;
//					for ( i = 1;i<=j;i++) {
//				        System.out.print(i);
//					}
//					for(int r = i;r >=1;r--){
//			    		System.out.print(r);
//			    	}
//				System.out.println();
//	        }
    	
    	
    	
    	
    	
    	int []  ar = {4 ,30 ,20, 10,40,10,20,5};
//        int [] ar1 = new int[1];
        for(int i = 0;i<=ar.length-1;i++) {
        	for(int j = 0; j<ar.length-i-1;j++) {
        		
        		System.out.println(ar.length-i-1);
        		System.out.println(Arrays.toString(ar));
        		if(ar[j]>ar[j+1]) {
        			int temp = ar[j];
//            		ar1[0] =ar[j];
            		ar[j] = ar[j+1];
            		ar[j+1] = temp;
            	}
        	}	
        }

    	for(int i =0;i<ar.length;i++) {
    		System.out.println(ar[i]);
    	}
    
    	}
    	
     	
    }

