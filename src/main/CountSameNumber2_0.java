package main;

import java.util.Scanner;

public class CountSameNumber2_0 {
    public static void main(String[] ar) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter your number :");
    	long n = in.nextLong();
    	System.out.print("Count number :");
    	long r = in.nextLong();
//    	long n =908765433335678865L;
    	
    	
    	
    	int count = 0;
    	
    	
    	while (n>0) {
    		
    		int rem =(int) (n % 10);
    		System.out.println(rem);
    		if(rem == r) {
    			count++;
    			System.out.println(count);
    		}
    		n = n/10;
//    		System.out.println(n);
    	}
//    	System.out.println(count);
    }
}
