package main;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
//        char  ch = in.next().trim().charAt(0);
//        String word = "Sethu";
//        System.out.println(word.charAt(2));
//        System.out.println(in.nextLine().trim());
        
//        System.out.println(ch);
        
        
      char  ch = in.next().trim().charAt(0);

        if(ch  >= 'a' && ch <= 'z') {
        	System.out.println("Lowercase");
        }else {
        	System.out.println("Uppercase");
        }
        
        
//        int a = 10;
//        int b = 20;
//        if( b != 290) {
//        	System.out.println("Hello world");
//        }

	}
}
