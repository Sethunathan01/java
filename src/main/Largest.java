package main;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();
        
        
//        int max= a;
//        if(b>max) {
//        	max = b;
//        }
//        if(c>max) {
//        	max = c;
//        }
//        System.out.println(max);
        
//        int max = 0;
//        if(a>b) {
//        	max = a;
//        }else {
//        	max = b;
//        }
//        if(c>max) {
//        	max = c;
//        }
//        System.out.println(max);
        int max = Math.max(c,Math.max(a, b));
        System.out.println(max);
//        System.out.println(Math.max(30,Math.max(2, 10)));
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
