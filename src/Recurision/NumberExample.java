package Recurision;

public class NumberExample {

	public static void main(String[] args) {
		number(1);
	}

	static void number(int i) {
		System.out.println(i);
		number1(2);
	}
	static void number1(int i) {
		System.out.println(i);
		number2(3);
	}
	static void number2(int i) {
		System.out.println(i);
		number3(4);
	}
	static void number3(int i) {
		System.out.println(i);
		number4(5);
	}
	static void number4(int i) {
		System.out.println(i);
		number5(6);
	}
	static void number5(int i) {
		System.out.println(i);
	}

}
