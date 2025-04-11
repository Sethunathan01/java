package main;

import java.util.Scanner;

public class Basics {
    public static void main(String[] ar) {
//    	int a = 10;
//    	if(a == 10) {
//            System.out.println("வணக்கம்");
//    	}
    	
//    	int count = 1;
//    	while (count != 51) {
//    		System.out.println(count);
//    		count++;
//    	}
    	
//    	for(int count = 1;count !=6;count++) {
//            System.out.println(count );
//    	}
    	
    	Scanner on = new Scanner (System.in) ;
    	System.out.print("please enter teamp in C :");
    	float tempC = on.nextFloat();
    	float tempF = (tempC * 9/5)+32;
    	System.out.println(tempF);
    }
    
}
