package main;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7  , 8  , n
        // 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , n 
		
		// i/p = 7 
		// o/p = 13
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		while(count >= n) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
		}
			System.out.println(b);
		}
		

	}
}