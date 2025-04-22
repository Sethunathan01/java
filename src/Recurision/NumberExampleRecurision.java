package Recurision;

public class NumberExampleRecurision {

	public static void main(String[] args) {
		print(1);
		
	}

	static void print(int n) {
		if(n == 5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		//recurision call
	
//if you are calling a function again and again,  you can treat it as a separcall int the stack 
		
//		this is called tail recursion
//		this is the last function call
		print(n+1);
	}

}
