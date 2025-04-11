package function3_0;

import java.util.Arrays;

public class OverLoading {

	public static void main(String[] args) {
//		fun(2);
//		fun("String");
//		sum(2,3,4);
//		sum(2,4);
//		demo(1,2,3,4);
//		demo("dsg","oohiu");
//		demo(98,8);
	}
	
	private static void demo(String...v) {
        System.out.println(Arrays.toString(v));		
		
	}

	private static void demo(int...v) {
		for(int s:v) {
	        System.out.println(s);		
		}
        System.out.println(Arrays.toString(v));		

	}
	
	
	static void sum(int i, int j, int k) {
        System.out.println(i+j+k);		
	}
	static void sum(int i, int j) {
		System.out.println(i+j);
	}
	
	
	
	static void fun(int a) {
		System.out.println(a);
	}
    static void fun(String a) {
		System.out.println(a);
	}

}
