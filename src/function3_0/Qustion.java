package function3_0;

import java.util.Scanner;

public class Qustion {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		boolean ans = isPrime(n);
//		System.out.println(ans);
//		
//		for(int i = 100;i<10000;i++) {
//			if(isArmstrong(i)) {
//				System.out.println(i+" ");
//			}
//		}
		
		
//		for(int i = 1;i<100;i++) {
//			if(isPrime(i)) {
//				System.out.println(i+" ");
//			}
//		}

		
	}
	
	static boolean isArmstrong(int n) {
		int origianal = n;
		int sum = 0;
		while(n>0) {
			int rem = n % 10;
		    n = n/10;
		    sum = sum +rem*rem*rem;
		}
		return sum == origianal;
		
	}
	static boolean isPrime(int n) {
		if(n <=1) {
			return false;
		}
		int c = 2;
		
		while(c*c <= n) {
			if(n % c == 0) {
				return false; 
			}
			c++;
			
		}
		if(c*c>n) {
			return true;
		}
//		return c * c > n;
		return false;
	}
}
