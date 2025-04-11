package main;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("opretar");
		char op = in.next().trim().charAt(0);
		int ans = 0;
		if(op == '+' ||op == '-'|| op == '*' || op == '/'|| op == '%' ) {
			System.out.println("Enter");
			int num1 = in.nextInt();
			System.out.println("Enter");
			int num2 = in.nextInt();
			
				if(op == '+') {
					ans = num1 + num2;
					}if(op == '-') {
					ans = num1 - num2;
					}if(op == '*') {
						ans = num1 * num2;
					}if(op == '/') {
						if(num1 != 0) {
							ans = num1 / num2;
						}
					}if(op == '%') {
						ans = num1 % num2;
				}
				
					System.out.println("Ana :"+ans);

			}else if(op == 'x' || op == 'X') {
				System.out.println("Out");
				break;
			}else { 
				System.out.println("Invalid Opration");
			}

		}
	}

}
