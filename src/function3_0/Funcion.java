package function3_0;

import java.util.Arrays;
import java.util.Scanner;

class Funcion{
	public static void main(String[] ar) {
//		int num1,num2,sum;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter number 1: ");
//		num1 = scan.nextInt();
//		System.out.println("Enter number 2: ");
//		num2 = scan.nextInt();
//		sum = num1 + num2;
//		System.out.println(sum);
//		System.out.println(a(2,4,77));
		
		String name ="Sethunathan";
		name = "Sethu";
		shaneName(name);
		
		
//		System.out.println(name); 
		int a = 10;
		int b = 20;
		
		int d = svap(a,b);
//		System.out.println("a:" +a+ "  b:"+b);
//		System.out.print(svap(a, b));
		
		
		
		
		String name1 = "Sethunathan";
//		shaneName(name1);
//		System.out.println(name1);
		

	
		int[] arr = new int[] {1,2,3,4};
		
		System.out.println(Arrays.toString(arr));

		int[] k =  change(arr);
		System.out.println(k);

		System.out.println(Arrays.toString(arr));
	}

	   static int[] change(int[] nums) {
       nums[0] = 88;	
       return nums;
       }






	static void shaneName(String name) {
      name = "Sethu"; 
      System.out.println(name);
	}

	 
	 
	 
	static int svap(int a,int b) {
		 int s = a;
		     a = b;
		     b = s;
		     return a;
	 }
	
	
	
	
	static String green(String name) {
		String message = "My name is "+name;
		return message;
	}
	
	
	
	
	
	static int a(int...a){
		int sum=0;
		for(int a1:a) {
			sum+=a1;
		}
		return sum;
	}
	
	
	
	
	
}